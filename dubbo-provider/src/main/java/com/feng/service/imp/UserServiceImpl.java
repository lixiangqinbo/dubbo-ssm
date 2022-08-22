package com.feng.service.imp;

import com.alibaba.dubbo.config.annotation.Service;
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

@Service(version = "v1.0")//dubbo中的service注解：将这个类提供的方法和服务对外发布，将访问的ip端口，路径注册到注册中
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
