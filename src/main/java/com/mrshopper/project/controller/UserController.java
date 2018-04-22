package com.mrshopper.project.controller;

import com.mrshopper.project.entity.User;
import com.mrshopper.project.entity.UserRole;
import com.mrshopper.project.service.OrderService;
import com.mrshopper.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @PostMapping("/greeting")
    public String addNewUser
            (@RequestParam String email, @RequestParam String username, @RequestParam String lastname,
             @RequestParam String login, @RequestParam String password) {

        User n = new User(null, email, username, lastname, login, password, null, null);
        System.out.println(n.getIdUser());
        userService.save(n);
        return "greeting";
    }


    /*@GetMapping("/users")
    public String getAllUsers(){
        return userService.getAllUsers().toString();
    }

    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable Long id){
        return userService.getUserById(id).toString();
    }*/


}
