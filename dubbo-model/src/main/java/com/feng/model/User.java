package com.feng.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/8/16 23:50
 * @Version V1.0
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String userName;
    private String password;
    private String email;
    private String gender;

    public User() {
    }


}
