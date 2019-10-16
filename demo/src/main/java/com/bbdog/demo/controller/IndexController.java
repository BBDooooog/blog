package com.bbdog.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

    @RequestMapping(value = "/index.do")
    public String index(){

        return "/index/index";
    }













}
