package com.example.demo.PaymentProcessorType;

import org.springframework.stereotype.Service;

import com.example.demo.IPaymentProcessor;

@Service
public class VisaProcessor implements IPaymentProcessor {
    public String getType() {
        return "Visa";
    }

    public void processPayment(double amount) {
        System.out.println("Processing Visa payment of $" + amount);
    }
}
