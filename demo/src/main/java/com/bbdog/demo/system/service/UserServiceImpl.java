package com.bbdog.demo.system.service;

import com.bbdog.demo.dao.UserDao;
import com.bbdog.demo.entity.User;
import com.bbdog.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl {
    @Autowired
    private UserDao userDao;

    public User getUserById(Long id){
        return userDao.get(id);
    }
    public User getUserByLoginName(String userName){
        return userDao.getUserByName(userName);
    }
    public boolean addUser(User user){
        boolean result = false;
        try{
            userDao.insert(user);
            result = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

}