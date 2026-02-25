package com.docinc;

public class EnrollmentService {

    private AccountRepository accountRepository;

    public EnrollmentService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // Verify identity by last 4 digits of SSN
    public boolean verifyIdentity(String accountNumber, String last4SSN) {
        String storedSSN = accountRepository.getLast4SSN(accountNumber);
        return storedSSN != null && storedSSN.equals(last4SSN);
    }
}