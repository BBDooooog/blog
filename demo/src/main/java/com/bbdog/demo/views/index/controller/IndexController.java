package com.bbdog.demo.views.index.controller;

import com.bbdog.demo.views.base.BaseController;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController extends BaseController {

    @RequestMapping(value = "/index.do")
    public String index(){
        return "/index/index";
    }














}
