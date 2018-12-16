package com.bbdog.demo.controller;

import com.bbdog.demo.entity.User;
import com.bbdog.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "test")
public class TestDBController {
    @Autowired
    private UserMapper userMapper;

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
}
