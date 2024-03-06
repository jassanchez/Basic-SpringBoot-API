package com.asanchez.springapi.springapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.asanchez.springapi.springapi.entities.Product;

@Repository
public interface IProductRepository extends CrudRepository<Product, Long> {

}
