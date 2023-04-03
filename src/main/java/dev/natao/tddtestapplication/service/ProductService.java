package dev.natao.tddtestapplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.natao.tddtestapplication.model.Product;

@Service
public class ProductService {

    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        return productList;
    }

    public Optional<Product> findById(Long id) {
        Optional<Product> product = Optional.of(new Product());
        return product;
    }

    public Product addProduct(Product product) {
        return product;
    }
    
}
