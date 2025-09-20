package com.example.demo.Notification;

import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements NotificationStrategy {
    @Override
    public NotificationType getType() {
        return NotificationType.EMAIL;
    }

    @Override
    public void sendNotification(String customerId, String message) {
        System.out.println("📧 Sent EMAIL to " + customerId + ": " + message);
    }
}
