package com.bbdog.demo.system.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LogFilter extends HandlerInterceptorAdapter {
//        private static final Logger logger = LoggerFactory.getLogger(InitInterceptor.class);

    //进入请求之前
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        System.out.println("请求之前");
        return true;
    }

    //接收请求之后，返回页面之前
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception{
        System.out.println("处理完成，马上返回页面");
    }

    //返回页面之后
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception{
        System.out.println("返回页面之后");
    }

}
