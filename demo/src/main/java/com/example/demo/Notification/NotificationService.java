package com.example.demo.Notification;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final Map<NotificationType, NotificationStrategy> strategies;

    @Autowired
    public NotificationService(List<NotificationStrategy> strategyList) {
        this.strategies = strategyList.stream()
                .collect(Collectors.toMap(NotificationStrategy::getType, s -> s));
    }

    public void notify(NotificationType notificationType, String customerId, String message) {
        NotificationStrategy strategy = strategies.get(notificationType);
        if (strategy == null)
            throw new IllegalArgumentException("Unsupported type: " + notificationType);
        strategy.sendNotification(customerId, message);
    }
}
