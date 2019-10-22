package com.bbdog.demo.system.service;

import com.bbdog.demo.entity.Role;
import com.bbdog.demo.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public Role selectById(Integer id){
        return roleMapper.selectByPrimaryKey(id);
    }
}
