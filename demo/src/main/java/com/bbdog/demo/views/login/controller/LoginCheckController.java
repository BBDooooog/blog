package com.bbdog.demo.views.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginCheckController {



    @RequestMapping(value = "checkEMail",method = RequestMethod.POST)
    public void checkEMail(){

    }

    @RequestMapping(value = "checkPassword",method = RequestMethod.POST)
    public void checkPassword(){

    }

}
