package com.feng.controller;

import com.feng.model.User;
import com.feng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/8/17 9:43
 * @Version V1.0
 */
@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login",method = RequestMethod.GET)
    @ResponseBody
    public User login(String username,String password){
        User user = userService.login(username, password);
        if(user==null){
            return null;
        }
        return user;
    }



}
