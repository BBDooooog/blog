package com.bbdog.demo.dao;

import com.bbdog.demo.mapper.UserRoleMapper;
import org.springframework.stereotype.Component;
import com.bbdog.demo.dao.MyBatisDao;
import com.bbdog.demo.entity.UserRole;

import java.util.List;

@Component
public class UserRoleDao extends MyBatisDao<UserRole> {


    public List<UserRole> listUserRoleByUserId(Long userId){
        return getMapper(UserRoleMapper.class).listUserRoleByUserId(userId);
    }
}