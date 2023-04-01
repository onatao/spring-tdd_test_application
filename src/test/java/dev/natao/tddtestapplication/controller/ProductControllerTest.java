package dev.natao.tddtestapplication.controller;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Mock - in this case, a dummy Product for
 * testing purposes only
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

    }


}
