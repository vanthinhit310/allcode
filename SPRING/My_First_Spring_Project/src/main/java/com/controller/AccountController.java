package com.controller;

import com.model.Account;
import com.service.AccountService;
import com.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "/Account")
public class AccountController {
    @Autowired
    AccountService accountService;
    @RequestMapping(value = "/DangKi")

    public String DangKi(HttpServletRequest request){
        String username = request.getParameter("username");
        String pass= request.getParameter("pass");
        String email = request.getParameter("email");
        String sdt = request.getParameter("sdt");
        Account account = new Account();
        account.setTenTk(username);
        account.setMatKhau(pass);
        account.setEmail(email);
        account.setSdt(sdt);

        accountService.addTaikhoan(account);

        return "Index";
    }

    @RequestMapping(value = "DangNhap")
    public String DangNhap(HttpServletRequest request , HttpSession session){
        String username = request.getParameter("taikhoan");
        String  pass =  request.getParameter("matkhau");
        boolean b = accountService.checkUP(username, pass);
        if (b){
            session.setAttribute("account" ,accountService.getOne(username));
            return "Index";
        }
        return "LoginPage";
    }
}
