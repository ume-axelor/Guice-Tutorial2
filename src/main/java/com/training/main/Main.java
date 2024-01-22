package com.training.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;
import com.training.module.PaymentModule;
import com.training.service.PaymentService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new PaymentModule());

        PaymentService cardPaymentService =
            injector.getInstance(Key.get(PaymentService.class, Names.named("CardPayment")));

        PaymentService cashPaymentService =
            injector.getInstance(Key.get(PaymentService.class, Names.named("CashPayment")));
        
        cardPaymentService.processPayment();
        cashPaymentService.processPayment();
    }
}
