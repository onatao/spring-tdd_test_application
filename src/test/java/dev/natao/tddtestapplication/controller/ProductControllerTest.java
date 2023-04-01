package dev.natao.tddtestapplication.controller;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


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
        // Used to test requests on ProductController
        this.mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
    }

    /**
     *  Must return HttpStatus 200 OK 
     */
    @Test
    public void testing_findAll_HttpStatus() throws Exception {
        /**
         *  Arrange - preparation
         *  Create a get request (sameway happens on Postman)
         *  using API path.
         */
        var requestBuilder = MockMvcRequestBuilders.get("/api/product");
  
        /** 
         *  Act - action and Assert - confirmation
         *  mockMvc perform an Request action on API
         *  and the expected is HttpStatus.OK
         */
        this.mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testing_findById_HttpStatus() throws Exception {
        var requestIdBuilder = MockMvcRequestBuilders.get("/api/product/{id}");

        this.mockMvc.perform(requestIdBuilder).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testing_addProduct_HttpStatus() throws Exception {
        var postBuilder = MockMvcRequestBuilders.post("/api/product");
        this.mockMvc.perform(postBuilder).andExpect(MockMvcResultMatchers.status().isOk());
    }

}
