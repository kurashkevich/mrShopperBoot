package com.mrshopper.project.controller;

import com.mrshopper.project.entity.Detail;
import com.mrshopper.project.entity.Product;
import com.mrshopper.project.entity.User;
import com.mrshopper.project.service.DetailService;
import com.mrshopper.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ProductService productService;

    @Autowired
    private DetailService detailService;

    @GetMapping
    public String getAdminPage(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model){
        List<Product> products = productService.getProducts();
        model.addAttribute("name", products.size());
        model.addAttribute("products", productService.getProducts());
        return "administration";
    }

    @PostMapping
    public String addNewProduct
            (@RequestParam String manufacturer, @RequestParam Double price,
             @RequestParam Integer count) {

        Product product = new Product();
        Detail detail = new Detail("asd", "anfroid", "213", "342", "5.5", "asdkuhads as a a aa ");
        detailService.save(detail);
        //product.setIdProduct(idProduct);
        product.setManufacturer(manufacturer);
        product.setPrice(price);
        product.setCount(count);
        product.setDetail(detail);
        productService.save(product);
        return "greeting";
    }

}
