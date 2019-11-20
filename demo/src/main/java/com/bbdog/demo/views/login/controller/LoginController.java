package com.bbdog.demo.views.login.controller;


import com.bbdog.demo.views.login.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(LoginController.class);


    @RequestMapping("/")
    public String showHome() {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        logger.info("当前登陆用户：" + name);
        return "/index/index";
    }

    @RequestMapping("/login")
    public String showLogin(Model model) {
        return "/login/login";
    }

    @RequestMapping(value = "/doRregister")
    public String doRegister(HttpServletRequest request, UserVo user, ModelMap modelMap){
        System.out.println(user.toString());
        modelMap.put("userVo",user);
        return "/login/doRegister";
    }

    @RequestMapping("/register")
    public String register(HttpServletRequest request, UserVo user){
        System.out.println(user.toString());

        return "/login/register";
    }










    /*@RequestMapping("/admin")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String printAdmin() {
        return "如果你看见这句话，说明你有ROLE_ADMIN角色";
    }

    @RequestMapping("/user")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_USER')")
    public String printUser() {
        return "如果你看见这句话，说明你有ROLE_USER角色";
    }*/




}
