package com.ca.steam.service;

import com.ca.steam.bean.User;

public interface UserService {

    Integer saveUser(User user);

    User getUserById(Integer id);
}
