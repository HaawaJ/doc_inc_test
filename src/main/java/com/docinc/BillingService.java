package com.docinc;

public class BillingService {

    // $2 per electronic statement
    public double calculateCharge(int numberOfStatements) {
        return numberOfStatements * 2.0;
    }
}