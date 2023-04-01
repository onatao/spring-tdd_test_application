package dev.natao.tddtestapplication.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
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

    @Test
    public void calculate_product_total_value() {
        // Arrange - preparation
        productTest.setProductQuantity(10);
        productTest.setDiscountValue(10d);
        productTest.setAdditionValue(0d);
        productTest.setProductValue(10d);
        Double expectedValue = 90d;
        // Act - action
        double result = productTest.totalValue();
        // Assert - confirmation
        Assertions.assertEquals(expectedValue, result);
    }


    
}
