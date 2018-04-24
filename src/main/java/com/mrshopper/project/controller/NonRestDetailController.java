package com.mrshopper.project.controller;

import com.mrshopper.project.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/nonRestDetail")
public class NonRestDetailController {
    @Autowired
    DetailService detailService;

    @GetMapping
    public String getDetailById(@RequestParam Long id,  Model model){
        model.addAttribute("detailById", detailService.getProductById(id));
        return "detail/main";
    }
}
