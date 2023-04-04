package dev.natao.tddtestapplication.controller;


import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import dev.natao.tddtestapplication.model.Product;
import dev.natao.tddtestapplication.service.ProductService;


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

    @MockBean
    private ProductService productService;

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
        List<Product> productList = new ArrayList<>();
        var requestBuilder = MockMvcRequestBuilders.get("/api/product");
        /*
         *  when - Mockito method that can call any method
         *  thenReturn - return productList
         */
        when(this.productService.findAll()).thenReturn(productList);
  
        /** 
         *  Act - action and Assert - confirmation
         *  mockMvc perform an Request action on API
         *  and the expected is HttpStatus.OK
         */
        this.mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testing_findById_HttpStatus() throws Exception {
        // Preparation - creating a dummy product for test
        Product productTest = new Product();
        productTest.setProductId(2);
        productTest.setProductName("Smartphone");
        productTest.setProductQuantity(10);
        Optional<Product> productOpt = Optional.of(productTest);
        // Action - iniciating the request
        var requestBuilder = MockMvcRequestBuilders.get("/api/product/2");
        when(this.productService.findById(2)).thenReturn(productOpt);
        // .jsonPath - allow to pick up json data and compare
        this.mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers
        .jsonPath("$.productId").value("2"));
    }

    @Test
    public void testing_addProduct_HttpStatus() throws Exception {
        // Creating a dummy product for test (will be added)
        Product productTest = new Product();
        productTest.setProductName("Smartphone");
        productTest.setProductQuantity(10);

        // Turning the dummy product in JSON
        String json = new ObjectMapper().writeValueAsString(productTest);

        // Creating POST resquest
        var requestBuilder = MockMvcRequestBuilders.post("/api/product")
        .content(json) // Putting the json as a content
        .contentType(MediaType.APPLICATION_JSON); // set the Header for JSON

        // Setting product ID - will be returned
        productTest.setProductId(2);
        when(this.productService.addProduct(productTest)).thenReturn(productTest);

        // Perfoming the request
        this.mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.status().isCreated());
    }


}
