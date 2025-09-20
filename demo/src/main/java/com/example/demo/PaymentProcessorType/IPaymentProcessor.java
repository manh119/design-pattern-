package com.example.demo.PaymentProcessorType;

public interface IPaymentProcessor {
    String getType();

    void processPayment(double amount);
}
