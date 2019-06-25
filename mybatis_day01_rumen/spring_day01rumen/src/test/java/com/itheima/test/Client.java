package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Client
 * @Description TODO
 * @Author wx
 * @Date 2019/6/23 15:57
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        //1.使用 ApplicationContext 接口，就是在获取 spring 容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据 bean 的 id 获取对象
        AccountService aService = (AccountService) ac.getBean("accountService");
        System.out.println(aService);
        AccountDao aDao = (AccountDao) ac.getBean("accountDao");
        System.out.println(aDao);
    }
}
