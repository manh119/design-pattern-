package com.example.demo.PaymentProcessorType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ProcessPaymentDetail.ProcessMomoPaymentDetail;

@Service
public class MomoProcessor implements IPaymentProcessor {

    ProcessMomoPaymentDetail processMomoPaymentDetail;

    @Autowired
    public MomoProcessor(ProcessMomoPaymentDetail processMomoPaymentDetail) {
        this.processMomoPaymentDetail = processMomoPaymentDetail;
    }

    public String getType() {
        return "Momo";
    }

    public void processPayment(double amount) {
        processMomoPaymentDetail.processPayment(amount);
    }
}