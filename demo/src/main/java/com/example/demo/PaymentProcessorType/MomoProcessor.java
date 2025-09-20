package com.example.demo.PaymentProcessorType;

import org.springframework.stereotype.Service;

import com.example.demo.IPaymentProcessor;

@Service
public class MomoProcessor implements IPaymentProcessor{

    public String getType() {
        return "Momo";
    }

    public void processPayment(double amount) {
        System.out.println("Processing Momo payment of $" + amount);
    }
}