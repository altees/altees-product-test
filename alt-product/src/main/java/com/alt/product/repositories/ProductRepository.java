package com.alt.product.repositories;

import com.alt.core.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {

    Product findByProductName(String productName);
}
