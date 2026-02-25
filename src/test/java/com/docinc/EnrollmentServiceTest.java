package com.docinc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Stub implementation
class StubAccountRepository implements AccountRepository {
    @Override
    public String getLast4SSN(String accountNumber) {
        return "1234";  // Fixed fake response
    }
}

public class EnrollmentServiceTest {

    @Test
    void shouldVerifyIdentityWhenSSNMatches() {
        AccountRepository stubRepo = new StubAccountRepository();
        EnrollmentService service = new EnrollmentService(stubRepo);

        boolean verified = service.verifyIdentity("ACC123", "1234");

        assertTrue(verified); // Business rule verified
    }
}