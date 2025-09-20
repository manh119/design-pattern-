package com.example.demo.ProcessPaymentDetail;

public abstract class PaymentTemplate {

    public final void processPayment(double amount) {
        validate(amount);
        connectToGateway();
        processSpecificPayment(amount);
        saveTransaction(amount);
    }

    protected void validate(double amount) {
        System.out.println("Validating payment of amount: $" + amount);
    }

    protected void saveTransaction(double amount) {
        System.out.println("Saving transaction of amount: $" + amount);
    }

    protected abstract void connectToGateway();

    protected abstract void processSpecificPayment(double amount);
}
