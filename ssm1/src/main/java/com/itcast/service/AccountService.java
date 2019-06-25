package com.itcast.service;

import com.itcast.domian.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAll();
    public void saveAccount(Account account);
}
