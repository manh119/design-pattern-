package com.example.demo.ProcessPaymentDetail;

import org.springframework.stereotype.Service;

@Service
public class ProcessVisaPaymentDetail extends PaymentTemplate {

    @Override
    protected void connectToGateway() {
        System.out.println("Connecting to Visa payment gateway...");
    }

    @Override
    protected void processSpecificPayment(double amount) {
        System.out.println("Processing Visa payment of $" + amount);
    }

}
