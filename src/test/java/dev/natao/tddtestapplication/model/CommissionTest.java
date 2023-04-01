package dev.natao.tddtestapplication.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommissionTest {

    @Test
    public void calculate_commission_under_1000() {
        // Arrange - preparation
        Commission commissionTest = new Commission();
        Double standardValue = 1000d;
        Double commissionValue = 100d;
        // Act - Action
        Double finalValue = commissionTest.commissionValue(standardValue);
        // Assert - confirmation
        Assertions.assertEquals(commissionValue, finalValue);    
    }
    
}
