package com.bbdog.demo.mapper;

import com.bbdog.demo.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User getUserByName(String userName);
}