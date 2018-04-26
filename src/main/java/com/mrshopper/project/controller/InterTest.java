package com.mrshopper.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterTest {
    @GetMapping("/international")
    public String getInternationalPage() {
        return "international";
    }

}
