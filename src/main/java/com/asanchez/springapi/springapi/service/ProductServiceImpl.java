package com.asanchez.springapi.springapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asanchez.springapi.springapi.entities.Product;
import com.asanchez.springapi.springapi.repositories.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository _productRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Product> findAll() {
        return (List<Product>) _productRepository.findAll();
    }

    @Transactional
    @Override
    public Product save(Product product) {
        return _productRepository.save(product);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Product> findById(Long id) {
        return _productRepository.findById(id);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        _productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> update(Long id, Product product) {
        Optional<Product> oProduct = _productRepository.findById(id);
        if (oProduct.isPresent()) {
            Product productDb = oProduct.orElseThrow();

            productDb.setName(product.getName());
            productDb.setDescription(product.getDescription());
            productDb.setPrice(product.getPrice());

            return Optional.of(_productRepository.save(productDb));
        }

        return oProduct;
    }

}
