package com.itheima.service.impl;

import com.itheima.domain.User;
import com.itheima.service.UserService;

import java.util.List;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author wx
 * @Date 2019/6/22 21:23
 * @Version 1.0
 **/
public class UserDaoImpl implements UserService {
    public List<User> findAll() {
        System.out.println("查询账户");
        return null;
    }

    public User findById(Integer id) {
        System.out.println("查询一个人");
        return null;
    }

    public int saveUser(User user) {
        return 0;
    }

    public int updateUser(User user) {
        return 0;
    }

    public int deleteUser(Integer id) {
        return 0;
    }

    public List<User> findByName(String username) {
        return null;
    }

    public int findTotal() {
        return 0;
    }
}
