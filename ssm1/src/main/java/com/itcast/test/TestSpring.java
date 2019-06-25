package com.itcast.test;

import com.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestSpring
 * @Description TODO
 * @Author wx
 * @Date 2019/6/24 14:41
 * @Version 1.0
 **/
public class TestSpring {
@Test
    public void run1(){
   //
    ApplicationContext ac =new  ClassPathXmlApplicationContext("classpath:applicationContext.xml");
   AccountService as=(AccountService) ac.getBean("accountService");
    as.findAll();

}
}
