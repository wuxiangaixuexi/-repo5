package com.itcast.controller;

import com.itcast.domian.Account;
import com.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName AccountController
 * @Description TODO
 * @Author wx
 * @Date 2019/6/24 14:27
 * @Version 1.0
 **/
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层查询所有的账户信息");
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            model.addAttribute("list",list);
        }
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws Exception {
       accountService.saveAccount(account);
       response.sendRedirect(request.getContextPath()+"/account/findAll");

    }

}
