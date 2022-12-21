package com.sun.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;
import java.util.Date;

@Controller
public class HelloController {


    @GetMapping("/hello")
    public String hello() {

        return "hello! spring boot!";
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "欢迎使用springboot");
        model.addAttribute("content", "<font color='blue' size=18>细节决定成败</font>");
        model.addAttribute("now", new Date());
        return "index";
    }

    @RequestMapping("/scope")
    public String scope(HttpServletRequest request) {
        //request的作用域
        request.setAttribute("req", "springBoot");
        //session的作用域
        request.getSession().setAttribute("sess", "springboot");
        //application的作用域
        request.getSession().getServletContext().setAttribute("app", "springboot");
        return "scope";
    }


}
