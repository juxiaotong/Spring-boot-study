package com.jxt.service;

import com.jxt.dao.UserMapper;
import com.jxt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }
}
