package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Integer id);
    int saveUser(User user);
    int updateUser(User user);
    int deleteUser(Integer id);
    List<User> findByName(String username);
    int findTotal();

}
