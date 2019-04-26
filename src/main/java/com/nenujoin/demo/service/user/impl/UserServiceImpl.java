package com.nenujoin.demo.service.user.impl;

import com.nenujoin.demo.mapper.UserMapper;
import com.nenujoin.demo.service.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;
    @Override
    public List getAllUsers() {
        System.out.println(userMapper.getAllUsers()+"inServices");
        return userMapper.getAllUsers();
    }
}
