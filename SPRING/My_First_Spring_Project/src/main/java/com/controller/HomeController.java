package com.controller;

import com.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@Controller
public class HomeController {
    @Autowired
    SinhVienService sinhVienService;

    @RequestMapping(value = "/")
    public String Index() {
        return "Index";
    }

    @RequestMapping(value = "/DSSV")
    public String DSSV(HttpServletRequest request) {
        request.setAttribute("dssv", sinhVienService.getAll());
        return "dssv";
    }

    @RequestMapping(value = "/LoginPage")
    public String LoginPage() {
        return "login";
    }

    @RequestMapping(value = "RegisterPage")
    public String RegisterPage() {
        return "register";
    }

    @RequestMapping(value = "/Logout")
    public String Logout(HttpSession session) {
        session.removeAttribute("account");
        return "Index";
    }
}
