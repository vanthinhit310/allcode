package com.controller;

import com.services.GarellyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Controller
@RequestMapping(value = "/")
public class HomeController {
    @Autowired
    GarellyServices garellyServices;
    @RequestMapping(value = "/")
    public String Index(HttpSession session) {
        session.setAttribute("dshinhanh" , garellyServices.getAll());
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy hh:mm:ss");
        String dateStart = "10 10 2016 07:30:00";
        String dateNow = format.format(Calendar.getInstance().getTime());
        try {
            Date d1 = format.parse(dateStart);
            Date d2 = format.parse(dateNow);
            long diff = d2.getTime() - d1.getTime();
            session.setAttribute("diff", diff);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "Index";

    }
    @RequestMapping(value = "/Contact")
    public String Contact(){
        return "contact";
    }
}
