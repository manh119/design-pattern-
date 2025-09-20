package com.example.demo;

public interface IPaymentProcessor {
    String getType();

    void processPayment(double amount);
}
