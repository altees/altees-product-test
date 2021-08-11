package com.alt.test.fiegn;

import com.alt.core.domain.Product;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient("product-service")
@RibbonClient("product-service")
public interface ProductServiceFeignClient {

    @PostMapping("/admin/product")
    Product saveProduct(@RequestBody Product product);

    @GetMapping("/admin/product/{productName}")
    Product getProduct(@PathVariable String productName);
}
