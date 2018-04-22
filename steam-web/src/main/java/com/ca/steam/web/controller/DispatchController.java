package com.ca.steam.web.controller;

import com.ca.steam.bean.User;
import com.ca.steam.service.UserService;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@Controller
public class DispatchController {
    private final static Logger logger = LoggerFactory.getLogger(DispatchController.class);

    @Resource
    private UserService userService;


    @RequestMapping("/index")
    public String gotoIndex(Model model) {
        logger.debug("welcome....");
        List<String> nameList = Lists.newArrayList();
        nameList.add("Sam");
        nameList.add("Lucy");
        nameList.add("Marry");
        model.addAttribute("message", "欢迎大驾光临!");
        model.addAttribute("name", "Tom!");
        model.addAttribute("myList", nameList);
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
        user.setUpdateUser("Tom");
        userService.saveUser(user);
        return "save success!";
    }
}
