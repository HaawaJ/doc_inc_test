package com.docinc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BillingServiceTest {

    @Test
    void shouldCalculateCorrectCharge() {
        BillingService billingService = new BillingService();

        double result = billingService.calculateCharge(5);

        assertEquals(10.0, result); // 5 statements * $2 each
    }
}