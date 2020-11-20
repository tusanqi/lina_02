package com.itheima;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @date 2020/11/19 16:46
 */

public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        //创建spring的核心容器
        new ClassPathXmlApplicationContext("classpath:spring-provider.xml");

        //使其一直处于读取控制台信息的状态，阻塞它
        System.in.read();
    }
}
