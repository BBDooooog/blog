package com.bbdog.demo.mapper;

import com.bbdog.demo.entity.User;

public interface UserMapper extends BaseMapper<User> {

    User getUserByName(String loginName);
}