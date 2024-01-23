package com.training.request;

import com.google.inject.Inject;
import com.training.service.CardPaymentService;
import com.training.service.CashPaymentService;

public class RequestPayment {

    private final CardPaymentService cardPaymentService;
    private final CashPaymentService cashPaymentService;

    @Inject
    public RequestPayment(CardPaymentService cardPaymentService, CashPaymentService cashPaymentService) {
        this.cardPaymentService = cardPaymentService;
        this.cashPaymentService = cashPaymentService;
    }

    public void processCardPayment() {
        cardPaymentService.processPayment();
    }

    public void processCashPayment() {
        cashPaymentService.processPayment();
    }
}
