package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderProcess {

    private final Map<String, IPaymentProcessor> paymentProcessors;

    @Autowired
    public OrderProcess(List<IPaymentProcessor> paymentProcessors) {
        this.paymentProcessors = paymentProcessors.stream()
                .collect(java.util.stream.Collectors.toMap(IPaymentProcessor::getType, processor -> processor));
    }

    public void processOrder(String orderId, double amount, String paymentType) {
        // Logic to process the order
        System.out.println("Processing order: " + orderId);

        IPaymentProcessor paymentProcessor = paymentProcessors.get(paymentType);
        if (paymentProcessor == null) {
            throw new IllegalArgumentException("Unsupported payment type: " + paymentType);
        }

        // After processing the order, you might want to trigger payment processing
        paymentProcessor.processPayment(amount);

        System.out.println("Order " + orderId + " has been processed.");
    }
}
