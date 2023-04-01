package dev.natao.tddtestapplication.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootTest
public class CommissionTest {

    /**
     *  This class will be executed before 
     *  all the test methods.
     */
    @TestConfiguration
    static class CommissionConfiguration {
        /**
         * This method will create a new Commission().
         * @return a new instance of Commission.class 
         */
        @Bean
        public Commission commission() {
            return new Commission();
        }
    }
    
    @Autowired
    Commission commissionTest;

     /**
     *  Calculate commission based on the value of
     *  0.10% for sales up to 1000d.
     */
    @Test
    public void calculate_commission_upTo_1000() {
        // Arrange - preparation
        Double standardValue = 1000d;
        Double commissionValue = 100d;
        // Act - Action
        Double finalValue = commissionTest.commissionValue(standardValue);
        // Assert - confirmation
        Assertions.assertEquals(commissionValue, finalValue);    
    }

    /**
     *  Calculate commission based on the value of
     *  0.20% for above to 2000.00 (included).
     */
    @Test
    public void calculate_commission_above_2000() {
        // Arrange - preparation
        Double standardValue = 2000d;
        Double commissionValue = 400d;
        // Act - Action
        Double finalValue = commissionTest.commissionValue(standardValue);
        // Assert - confirmation
        Assertions.assertEquals(commissionValue, finalValue);
          
    }

}
