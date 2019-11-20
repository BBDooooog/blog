package com.bbdog.demo.dao;

import com.bbdog.demo.mapper.UserMapper;
import org.springframework.stereotype.Component;
import com.bbdog.demo.dao.MyBatisDao;
import com.bbdog.demo.entity.User;

@Component
public class UserDao extends MyBatisDao<User> {

    public User getUserByName(String loginName){
        return getMapper(UserMapper.class).getUserByName(loginName);
    }

}