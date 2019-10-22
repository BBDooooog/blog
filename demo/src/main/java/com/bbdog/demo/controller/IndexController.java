package com.bbdog.demo.controller;

import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class IndexController {

    @RequestMapping(value = "/index.do")
    public String index(){

        return "/index/index";
    }













}
