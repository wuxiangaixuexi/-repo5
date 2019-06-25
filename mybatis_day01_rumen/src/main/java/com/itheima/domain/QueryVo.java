package com.itheima.domain;

import java.io.Serializable;

/**
 * @ClassName QueryVo
 * @Description TODO
 * @Author wx
 * @Date 2019/6/23 11:25
 * @Version 1.0
 **/
public class QueryVo implements Serializable {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "user=" + user +
                '}';
    }
}
