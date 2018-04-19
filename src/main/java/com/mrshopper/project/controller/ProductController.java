package com.mrshopper.project.controller;

import com.mrshopper.project.entity.Product;
import com.mrshopper.project.entity.User;
import com.mrshopper.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String getProducts(){
        return productService.getProducts().toString();
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable Long id){
        return productService.getProductById(id).toString();
    }


}
