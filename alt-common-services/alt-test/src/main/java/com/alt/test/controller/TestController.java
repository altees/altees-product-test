package com.alt.test.controller;

import com.alt.core.domain.Product;
import com.alt.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;


    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product) {

        return testService.saveProduct(product);
    }


    @GetMapping(value = "/product/{productName}")
    public Product getProduct(@PathVariable String productName){

        return testService.getProduct(productName);
    }


}
