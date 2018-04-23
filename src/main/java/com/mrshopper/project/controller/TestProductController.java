package com.mrshopper.project.controller;

import com.mrshopper.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/nonRestProducts")
public class TestProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public String getProducts(Model model){
        model.addAttribute("products", productService.getProducts());
        return "product/index";
    }
}
