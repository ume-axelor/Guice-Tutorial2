package com.training.service;

import jakarta.inject.Named;

@Named("CashPayment")
public class CashPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Processing payment via Cash");
    }
}
