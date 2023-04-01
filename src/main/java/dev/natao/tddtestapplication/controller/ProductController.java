package dev.natao.tddtestapplication.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.natao.tddtestapplication.model.Product;

@RestController
@RequestMapping("/api/pessoas")
public class ProductController {
    
    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> productList = new ArrayList<>();

        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Product>> findById(@PathVariable Integer id) {
        Optional<Product> productOpt = Optional.of(new Product());

        return new ResponseEntity<>(productOpt, HttpStatus.OK);
    } 

    @PostMapping()
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        return new ResponseEntity<>(product, HttpStatus.OK); 
    }
}
