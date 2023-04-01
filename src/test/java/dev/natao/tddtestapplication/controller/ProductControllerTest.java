package dev.natao.tddtestapplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import dev.natao.tddtestapplication.model.Product;

/**
 * Mock - in this case, a dummy Product for
 * testing purposes only. Mock can simulate any
 * request.
 */
@WebMvcTest // Testing an Web API 
public class ProductControllerTest {
    // Mock MVC
    // Mockito
    // Mock   

    @Autowired
    private ProductController productController;

    @Autowired
    private MockMvc mockMvc; 

    @BeforeEach 
    public void setupMethod() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
    }

    /**
     *  Must return HttpStatus 200 OK 
     */
    @Test
    public void testing_findAll_HttpStatus() {
        // Arrange - preparation
        // Act - action
        // Assert - confirmation
    }

}
