package com.bbdog.demo.manager;


import com.bbdog.demo.dao.UserDao;
import com.bbdog.demo.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager {
    @Autowired
    private UserDao userDao;

    public User getUserByLoginName(String loginName){
        if (StringUtils.isBlank(loginName)){
            return null;
        }else {
            return userDao.getUserByName(loginName);
        }
    }
}
