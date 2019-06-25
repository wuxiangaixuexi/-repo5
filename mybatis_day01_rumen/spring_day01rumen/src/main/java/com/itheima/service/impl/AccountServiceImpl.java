package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.AccountService;

/**
 * @ClassName AccountServiceImpl
 * @Description TODO
 * @Author wx
 * @Date 2019/6/23 15:49
 * @Version 1.0
 **/
public class AccountServiceImpl implements AccountService{
    private AccountDao accountDao = new AccountDaoImpl();

    @Override
    public void saveAccount() {

    }
}
