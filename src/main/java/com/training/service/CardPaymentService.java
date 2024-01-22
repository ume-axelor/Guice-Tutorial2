package com.training.service;

import jakarta.inject.Named;

@Named("CardPayment")
public class CardPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Processing payment via Card");
    }
}
