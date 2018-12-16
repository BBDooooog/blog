package com.bbdog.demo.service;

import com.bbdog.demo.entity.User;
import com.bbdog.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public User getUserById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
    public boolean addUser(User user){
        boolean result = false;
        try{
            userMapper.insertSelective(user);
            result = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

}
