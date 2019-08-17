package com.feng.dao;

import com.feng.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    User login(@Param(value = "username") String username, @Param(value = "password") String password);


}
