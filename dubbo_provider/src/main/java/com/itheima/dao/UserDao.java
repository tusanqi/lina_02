package com.itheima.dao;

import com.itheima.pojo.User;

/**
 * @date 2020/11/19 13:38
 */
public interface UserDao {

    User findById(int id);
}
