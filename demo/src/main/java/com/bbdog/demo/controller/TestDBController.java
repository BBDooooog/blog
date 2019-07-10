package com.bbdog.demo.controller;

import com.bbdog.demo.entity.User;
import com.bbdog.demo.mapper.UserMapper;
import com.bbdog.demo.properties.Admin;
import com.bbdog.demo.properties.RedisConfig;
import com.bbdog.demo.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/test")
public class TestDBController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private Admin admin;
    @Autowired
    private RedisUtils redisUtils;


    @RequestMapping(value = "getUser")
    public User getUser(){
        User user = new User();
        user.setUserId(0);
        return user;
    }

    @RequestMapping(value = "getUserByDB")
    public User getUserByDB(){
        User user = new User();
        user = userMapper.selectByPrimaryKey(1);
        return user;
    }

    @RequestMapping(value = "/getRedis")
    @ResponseBody
    public String getRedis()throws Exception{
        return redisUtils.get("a").toString();
    }


}
