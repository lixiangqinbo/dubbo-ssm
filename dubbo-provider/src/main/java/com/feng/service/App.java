package com.feng.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/8/17 9:36
 * @Version V1.0
 */
public class App {

    public static void main(String args[]) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-service.xml");
        classPathXmlApplicationContext.start();
        System.in.read();
    }
}
