package com.itcast.dao;

import com.itcast.domian.Account;

import java.util.List;

public interface AccountDao {
   public List<Account> findAll();
   public void saveAccount(Account account);
}
