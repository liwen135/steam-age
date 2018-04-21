package com.ca.steam.web.controller;

import com.ca.steam.bean.User;
import com.ca.steam.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class DispatchController {
    private final static Logger logger = LoggerFactory.getLogger(DispatchController.class);

    @Resource
    private UserService userService;


    @RequestMapping("/index")
    public String gotoIndex() {
        logger.debug("welcome....");
        return "welcome";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String saveUser() {
        logger.debug("save....");
        User user = new User();
        user.setUserName("Tom");
        user.setPassWord("123456");
        user.setTelPhone("10086");
        user.setEmail("tom@126.com");
        user.setCreateUser("Tom");
        user.setCreateUser("Tom");
        userService.saveUser(user);
        return "save success!";
    }
}
