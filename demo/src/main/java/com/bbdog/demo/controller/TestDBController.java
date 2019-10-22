package com.bbdog.demo.controller;

import com.bbdog.demo.entity.User;
import com.bbdog.demo.mapper.UserMapper;
import com.bbdog.demo.system.properties.Admin;
import com.bbdog.demo.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestDBController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private Admin admin;
    @Autowired
    private RedisUtils redisUtils;


    @RequestMapping(value = "/getdbuser")
    public User getUserByDB(){
        User user = new User();
        user = userMapper.selectByPrimaryKey(1);
        return user;
    }

    @RequestMapping(value = "/getRedis")
    public String getRedis(){
        redisUtils.set("a",1);
        return redisUtils.get("a").toString();
    }





}
