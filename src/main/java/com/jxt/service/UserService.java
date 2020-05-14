package com.jxt.service;

import com.jxt.pojo.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User getUserByName(String username);

}
