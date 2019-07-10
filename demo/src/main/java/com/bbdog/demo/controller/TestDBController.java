package com.bbdog.demo.controller;

import com.bbdog.demo.entity.User;
import com.bbdog.demo.mapper.UserMapper;
import com.bbdog.demo.properties.Admin;
import com.bbdog.demo.properties.RedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestDBController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private Admin admin;
    @Autowired
    private RedisConfig redisConfig;

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
    @RequestMapping(value = "/testProperties")
    public String getAdmin(){
        System.out.println(redisConfig.toString());
        return redisConfig.toString();
    }


}
