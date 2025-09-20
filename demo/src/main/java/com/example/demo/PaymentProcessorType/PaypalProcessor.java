package com.example.demo.PaymentProcessorType;

import org.springframework.stereotype.Service;

@Service
public class PaypalProcessor implements IPaymentProcessor {
    public String getType() {
        return "PayPal";
    }

    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
