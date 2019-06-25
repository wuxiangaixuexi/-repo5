package com.itcast.service.impl;

import com.itcast.domian.Account;
import com.itcast.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AccountServiceImpl
 * @Description TODO
 * @Author wx
 * @Date 2019/6/24 14:24
 * @Version 1.0
 **/
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户");
    }
}
