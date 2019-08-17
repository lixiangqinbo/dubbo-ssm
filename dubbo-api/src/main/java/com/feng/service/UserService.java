package com.feng.service;

import com.feng.model.User;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/8/17 9:33
 * @Version V1.0
 */
public interface UserService {
    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    User login(String username,String password);
}
