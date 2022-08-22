package com.feng.controller;

import com.alibaba.dubbo.config.annotation.Reference;
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
    /**
     * 从zookeeper注册中心获取userService的访问url
     * 进行远程调用RPC
     * 将结果封装为一个代理对象并复制给属性
     * 注意避坑：之前dubbo配置写再springmvc Reference一直注入不成功为null ，
     * 后来将spring.xml删除将dubbo配置到springmvc中，
     * 问题解决：https://blog.csdn.net/zhou_java_hui/article/details/53039491
     */
    @Reference(version = "v1.0")//远程注解
//    @Autowired
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
