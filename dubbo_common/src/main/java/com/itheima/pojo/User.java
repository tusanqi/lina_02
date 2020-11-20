package com.itheima.pojo;


import java.io.Serializable;

/**
 * @date 2020/11/19 13:20
 */
//使用int声明的变量占4个字节，使用Integer声明的变量占8个字节

public class User implements Serializable {
    private String username;
    private Integer id;
    private Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
