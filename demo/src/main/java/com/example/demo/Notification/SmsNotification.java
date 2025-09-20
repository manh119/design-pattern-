package com.example.demo.Notification;

import org.springframework.stereotype.Component;

@Component
public class SmsNotification implements NotificationStrategy {
    @Override
    public NotificationType getType() {
        return NotificationType.SMS;
    }

    @Override
    public void sendNotification(String customerId, String message) {
        System.out.println("📱 Sent SMS to " + customerId + ": " + message);
    }
}
