package com.bbdog.demo.system.service;

import com.bbdog.demo.entity.UserRole;
import com.bbdog.demo.mapper.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleService {
    @Autowired
    private UserRoleMapper userRoleMapper;

    public List<UserRole> listByUserId(Integer userId) {
        return userRoleMapper.listByUserId(userId);
    }

}
