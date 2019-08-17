package com.feng.service.imp;

import com.feng.dao.UserDao;
import com.feng.model.User;
import com.feng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/8/17 9:31
 * @Version V1.0
 */

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public User login(String username, String password) {
        User user = userDao.login(username, password);
        return user;
    }
}
