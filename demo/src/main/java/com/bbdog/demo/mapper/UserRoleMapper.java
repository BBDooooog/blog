package com.bbdog.demo.mapper;

import com.bbdog.demo.entity.UserRole;

import java.util.List;

public interface UserRoleMapper {
    int deleteByPrimaryKey(UserRole key);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> listByUserId(Integer userId);
}