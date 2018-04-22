package com.ca.steam.service.impl;

import com.ca.steam.bean.User;
import com.ca.steam.dao.UserDao;

import com.ca.steam.manager.UserManager;
import com.ca.steam.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserManager userManager;

    @Resource
    private UserDao userDao;

    @Override
    public Integer saveUser(User user) {
        return userManager.insertUser(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.selectById(id);
    }
}
