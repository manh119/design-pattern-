package com.example.demo.PaymentProcessorType;

import org.springframework.stereotype.Service;

@Service
public class AmexProcessor implements IPaymentProcessor {
    public String getType() {
        return "AMEX";
    }

    public void processPayment(double amount) {
        System.out.println("Processing Amex payment of $" + amount);
    }

}
