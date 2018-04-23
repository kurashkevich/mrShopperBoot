package com.mrshopper.project.controller;

import com.mrshopper.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class NonRestUserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String addUser(){
        return "user/index";
    }
}
