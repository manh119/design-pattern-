package com.example.demo.Notification;

public interface NotificationStrategy {
    NotificationType getType(); // định danh strategy, ví dụ: "email", "sms"

    void sendNotification(String customerId, String message);
}
