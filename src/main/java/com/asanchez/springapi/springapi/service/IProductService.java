package com.asanchez.springapi.springapi.service;

import java.util.List;
import java.util.Optional;

import com.asanchez.springapi.springapi.entities.Product;

public interface IProductService {

    List<Product> findAll();
    Product save(Product product);
    Optional<Product> findById(Long id);
    void deleteById(Long id);
    Optional<Product> update(Long id, Product product);
}
