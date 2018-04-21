package com.ca.steam.dao;

import com.ca.steam.bean.User;

public interface UserDao {

    User selectById(Integer id);

    Integer insert(User user);

}
