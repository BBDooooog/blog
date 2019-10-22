package com.bbdog.demo.system.service;

import com.bbdog.demo.entity.User;
import com.bbdog.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
    public User getUserByLoginName(String userName){
        return userMapper.getUserByName(userName);
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
