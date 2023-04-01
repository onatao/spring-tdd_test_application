package dev.natao.tddtestapplication.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommissionTest {

     /**
     *  Calculate commission based on the value of
     *  0.10% for sales up to 1000d.
     */
    @Test
    public void calculate_commission_upTo_1000() {
        // Arrange - preparation
        Commission commissionTest = new Commission();
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
        Commission commissionTest = new Commission();
        Double standardValue = 2000d;
        Double commissionValue = 400d;
        // Act - Action
        Double finalValue = commissionTest.commissionValue(standardValue);
        // Assert - confirmation
        Assertions.assertEquals(commissionValue, finalValue);
          
    }

}
