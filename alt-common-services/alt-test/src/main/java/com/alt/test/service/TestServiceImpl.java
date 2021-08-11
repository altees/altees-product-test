package com.alt.test.service;

import com.alt.core.domain.Product;
import com.alt.test.fiegn.ProductServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private ProductServiceFeignClient productServiceFeignClient;

    @Override
    public Product saveProduct(Product product) {
        return productServiceFeignClient.saveProduct(product);
    }

    @Override
    public Product getProduct(String productName) {
        return productServiceFeignClient.getProduct(productName);
    }
}
