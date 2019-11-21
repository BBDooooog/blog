package com.bbdog.demo.system.security.handler;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Component
public class MyAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    public MyAuthenticationSuccessHandler(){
        setAlwaysUseDefaultTargetUrl(true);
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        String loginName = authentication.getName();
        Cookie cookie = new Cookie("_token_bbdog", loginName + new Date().getTime());
        cookie.setPath("/");
//        if (MAXAGE > 0) {
            cookie.setMaxAge(0);
//        }
//        if(StringUtils.isNotBlank(domain)){
//            cookie.setDomain(domain);
//        }
        response.addCookie(cookie);
        super.onAuthenticationSuccess(request, response, authentication);
    }
}
