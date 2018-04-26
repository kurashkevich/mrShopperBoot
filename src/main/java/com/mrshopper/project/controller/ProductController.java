package com.mrshopper.project.controller;

import com.mrshopper.project.entity.Detail;
import com.mrshopper.project.entity.Product;
import com.mrshopper.project.entity.User;
import com.mrshopper.project.service.DetailService;
import com.mrshopper.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    DetailService detailService;


    @GetMapping("/more")
    public String getMoreInfo(){
        return "product/product-info";
    }
    @GetMapping
    public String getProducts(Model model){
        model.addAttribute("products", productService.getProducts());
        return "product/mainPage";
    }

    @GetMapping("/filter")
    public String getProductsByFilter(@RequestParam String manufacturer, Model model){
        model.addAttribute("products", productService.getProductsByManufacturer(manufacturer));
        return "product/mainPage";
    }

    @GetMapping("/byFilter")
    public String getProductsByFilter(@RequestParam String manufacturer,@RequestParam String osName,
                                      @RequestParam String minD, @RequestParam String maxD, Model model){
        model.addAttribute("products", productService.getProductsByFilter(manufacturer, osName, minD, maxD));
        return "product/product-card";
    }
    @GetMapping("/byOsName")
    public String getProductsByOsName(@RequestParam String manufacturer, @RequestParam String osName, Model model){
        model.addAttribute("products", productService.getProductsByOsName(manufacturer, osName));
        return "product/product-card";
    }

    @Transactional
    @GetMapping("/delete")
    public String delProduct(@RequestParam Long id){
        System.out.println(id);
        productService.deleteProduct(id);
        return "product/main";
    }

    @GetMapping("/create")
    public String addProductForm(){
        return "product/add-product-form";
    }

    @PostMapping("/create/product")
    public String addProduct(@RequestParam String manufacturer,@RequestParam Double price, @RequestParam Integer count,
                             @RequestParam String model, @RequestParam String os, @RequestParam String rom, @RequestParam String ram,
                             @RequestParam String screenSize, @RequestParam String description){
        Detail detail = new Detail();
        detail.setModel(model);
        detail.setOs(os);
        detail.setRom(rom);
        detail.setRam(ram);
        detail.setScreenSize(screenSize);
        detail.setDescription(description);
        detailService.save(detail);

        Product product = new Product();
        product.setManufacturer(manufacturer);
        product.setPrice(price);
        product.setCount(count);
        product.setDetail(detail);
        productService.save(product);
        return "product/main";
    }





}
