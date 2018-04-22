package com.ca.steam.manager.impl;

import com.ca.steam.bean.User;
import com.ca.steam.dao.UserDao;
import com.ca.steam.manager.UserManager;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserManagerImpl implements UserManager {
    @Resource
    private UserDao userDao;

    @Override
    public Integer insertUser(User user) {
        return userDao.insert(user);
    }
}
