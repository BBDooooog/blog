package com.bbdog.demo.system.service;

import com.bbdog.demo.entity.User;

public interface UserService {
    public User getUserById(Integer id);
    boolean addUser(User user);
}
