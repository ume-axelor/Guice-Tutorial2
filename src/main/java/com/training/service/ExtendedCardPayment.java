package com.training.service;

public class ExtendedCardPayment extends CardPaymentService {
	@Override
    public void processPayment() {
		super.processPayment();
        System.out.println("Processing payment via ExtendedCard");
    }
}
