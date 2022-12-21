package com.sun.controller;

import com.sun.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/list")
    public String list(Model model) {
        List<User> userList = new ArrayList<User>();
        userList.add(new User(1, "张", 1, "1234"));
        userList.add(new User(2, "王", 2, "12345"));
        userList.add(new User(3, "孙", 1, "123456"));
        model.addAttribute("users", userList);
        return "userlist";
    }

    @RequestMapping("/view/{id}")
    public String view(@PathVariable Integer id) {
        return "userlist";
    }
}
