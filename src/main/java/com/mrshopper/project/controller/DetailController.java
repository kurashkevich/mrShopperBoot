package com.mrshopper.project.controller;

import com.mrshopper.project.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/details")
public class DetailController {
    @Autowired
    DetailService detailService;

    @GetMapping
    public String getDetailById(@RequestParam Long id, Model model){
        model.addAttribute("detailById", detailService.getProductById(id));
        return "detail/main";
    }


}
