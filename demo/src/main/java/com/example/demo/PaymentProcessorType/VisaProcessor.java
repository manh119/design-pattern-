package com.example.demo.PaymentProcessorType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ProcessPaymentDetail.ProcessVisaPaymentDetail;

@Service
public class VisaProcessor implements IPaymentProcessor {

    ProcessVisaPaymentDetail processVisaPaymentDetail;

    @Autowired
    public VisaProcessor(ProcessVisaPaymentDetail processVisaPaymentDetail) {
        this.processVisaPaymentDetail = processVisaPaymentDetail;
    }

    public String getType() {
        return "Visa";
    }

    public void processPayment(double amount) {
        processVisaPaymentDetail.processPayment(amount);
    }
}
