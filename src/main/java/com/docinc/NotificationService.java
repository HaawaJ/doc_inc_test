package com.docinc;

public class NotificationService {

    private EmailService emailService;

    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void notifyUser(String email) {
        emailService.sendEmail(
            email,
            "New Statement Available",
            "Your electronic statement is now available in your account."
        );
    }
}