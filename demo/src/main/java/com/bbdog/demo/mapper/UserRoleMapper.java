package com.bbdog.demo.mapper;

import com.bbdog.demo.entity.UserRole;

import java.util.List;

public interface UserRoleMapper extends BaseMapper<UserRole> {


    List<UserRole> listUserRoleByUserId(Long userId);
}