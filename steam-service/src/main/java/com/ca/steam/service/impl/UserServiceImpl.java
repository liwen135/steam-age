package com.ca.steam.service.impl;

import com.ca.steam.bean.User;
import com.ca.steam.dao.UserDao;
import com.ca.steam.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public Integer saveUser(User user) {
        return userDao.insert(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.selectById(id);
    }
}
