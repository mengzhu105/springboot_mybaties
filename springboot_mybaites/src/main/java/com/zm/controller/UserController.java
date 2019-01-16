package com.zm.controller;

import com.zm.domain.User;
import com.zm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/user")
    public List<User> queryUserList(){
        List<User> userList = userMapper.queryUserList();

        return userList;


    }
}
