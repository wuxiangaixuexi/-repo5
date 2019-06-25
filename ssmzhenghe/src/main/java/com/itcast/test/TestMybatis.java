package com.itcast.test;

import com.itcast.dao.AccountDao;
import com.itcast.domian.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @ClassName TestMybatis
 * @Description TODO
 * @Author wx
 * @Date 2019/6/24 19:34
 * @Version 1.0
 **/

//public class TestMybatis {
//    @Test
//    public void run1() throws Exception {
//        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//        SqlSession session = factory.openSession();
//        AccountDao dao = session.getMapper(AccountDao.class);
//        List<Account> all = dao.findAll();
//        for (Account account : all) {
//            System.out.println(account);
//        }
//        in.close();
//
//
//    }
//
//    @Test
//    public void run2() throws Exception {
//        Account account = new Account();
//        account.setName("低价");
//        account.setMoney(45.0);
//        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//        SqlSession session = factory.openSession(true);
//        AccountDao dao = session.getMapper(AccountDao.class);
//        dao.saveAccount(account);
//
//        in.close();
//
//
//    }
//
//
//}
