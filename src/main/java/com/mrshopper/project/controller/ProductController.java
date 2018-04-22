package com.mrshopper.project.controller;

import com.mrshopper.project.entity.Product;
import com.mrshopper.project.entity.User;
import com.mrshopper.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }


}
