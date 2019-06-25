package com.itheima.dao;

import com.itheima.domain.QueryVo;
import com.itheima.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User findById(Integer id);
    int saveUser(User user);
    int updateUser(User user);
    int deleteUser(Integer id);
    List<User> findByName(String username);
    int findTotal();
    List<User> findByVo(QueryVo vo);


}
