package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;

/**
 * @ClassName AccountDaoImpl
 * @Description TODO
 * @Author wx
 * @Date 2019/6/23 15:52
 * @Version 1.0
 **/
public class AccountDaoImpl implements AccountDao{
    @Override
    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
