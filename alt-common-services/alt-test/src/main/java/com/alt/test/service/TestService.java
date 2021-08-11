package com.alt.test.service;

import com.alt.core.domain.Product;

public interface TestService {
    Product saveProduct(Product product);

    Product getProduct(String productName);
}
