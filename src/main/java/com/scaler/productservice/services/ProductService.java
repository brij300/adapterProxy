package com.scaler.productservice.services;

import com.scaler.productservice.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long id);
    List<Product> getAllProducts() ;
    Product replaceProduct(Long id, Product product) ;
    Product addNewProduct(Product product);
    Product deleteProduct(Long id);
}
