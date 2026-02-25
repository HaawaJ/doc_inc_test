package com.docinc;

public class EmailService {

    // Example: send an email to a user
    public boolean sendEmail(String toAddress, String subject, String body) {
        // For now, just simulate sending
        System.out.println("Sending email to " + toAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        return true; // pretend email was sent successfully
    }
}