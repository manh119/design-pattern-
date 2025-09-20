package com.example.demo.ProcessPaymentDetail;

import org.springframework.stereotype.Service;

@Service
public class ProcessMomoPaymentDetail extends PaymentTemplate {

    @Override
    protected void connectToGateway() {
        System.out.println("Connecting to Momo payment gateway...");
    }

    @Override
    protected void processSpecificPayment(double amount) {
        System.out.println("Processing Momo payment detail of $" + amount);
    }

}
