package com.bbdog.demo.controller;

import com.bbdog.demo.entity.User;
import com.bbdog.demo.mapper.UserMapper;
import com.bbdog.demo.properties.Admin;
import com.bbdog.demo.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
//@RequestMapping(value = "/test")
public class TestDBController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private Admin admin;
    @Autowired
    private RedisUtils redisUtils;


    @RequestMapping(value = "/getuser")
    public User getUser(){
        User user = new User();
        user.setUserId(0);
        return user;
    }

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

    @RequestMapping("/testRequestParam")
    public void requestParam(User user ,@RequestParam Integer userId,
                            @RequestParam String userName,@RequestParam String password,@RequestParam String phone){
        System.out.println("userId=" + userId + "userName=" + userName + "password=" + password + "phone="+ phone);
        System.out.println(user.toString());
    }

    @RequestMapping("/testRequestBody")
    public void requestBody(@RequestBody List<User> userList){
        for (User user :userList){
            System.out.println(user.toString());
        }
    }

    @RequestMapping(value = "/getParam",method = RequestMethod.GET)
    public String getParam(@RequestParam("name") String id){
        return id;
    }




}
