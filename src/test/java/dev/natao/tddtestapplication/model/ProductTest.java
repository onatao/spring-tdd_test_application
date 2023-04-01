package dev.natao.tddtestapplication.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest
public class ProductTest {

    @SpringBootConfiguration
    static class ProductConfiguration {
        @Bean
        public Product product() {
            return new Product();
        }
    }

    @Autowired
    Product productTest;

    


    
}
