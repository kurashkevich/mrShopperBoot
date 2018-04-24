package com.mrshopper.project.controller;

import com.mrshopper.project.entity.Product;
import com.mrshopper.project.entity.User;
import com.mrshopper.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @GetMapping("/by/{manufacturer}")
    public List<Product> getProductsByManufacturer(@PathVariable String manufacturer){
        return productService.getProductsByManufacturer(manufacturer);
    }

    @GetMapping("/by/os/{os}")
    public List<Product> findAllByDetailOs(@PathVariable String os){
        return productService.findAllByDetailOs(os);
    }
    @GetMapping("/by/filter/{os}/{min, max}")
    public List<Product> findAllByDetailOsAndPriceBetween(@PathVariable String os, @PathVariable double min, @PathVariable double max){
        return productService.findAllByDetailOs(os);
    }





}
