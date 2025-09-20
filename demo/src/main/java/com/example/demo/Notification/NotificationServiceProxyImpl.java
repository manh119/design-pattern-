package com.example.demo.Notification;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceProxyImpl implements NotificationService {

    private final NotificationServiceImpl notificationServiceImpl;

    private final Map<String, Instant> lastSentMap = new HashMap<>();

    @Autowired
    public NotificationServiceProxyImpl(NotificationServiceImpl notificationServiceImpl) {
        this.notificationServiceImpl = notificationServiceImpl;
    }

    @Override
    public void notify(NotificationType notificationType, String customerId, String message) {
        // Logging
        System.out.println("LOG: Request to send notification to " + customerId + " at " + Instant.now());

        // Spam check (5 giây)
        Instant now = Instant.now();
        if (lastSentMap.containsKey(customerId)) {
            Instant lastTime = lastSentMap.get(customerId);
            if (now.minusSeconds(5).isBefore(lastTime)) {
                System.out.println("⚠️ Blocked spam to " + customerId);
                return;
            }
        }

        // Gọi service thật
        notificationServiceImpl.notify(notificationType, customerId, message);

        // Cập nhật last sent
        lastSentMap.put(customerId, now);
    }
}
