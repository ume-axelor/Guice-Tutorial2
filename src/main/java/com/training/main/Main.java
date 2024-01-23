package com.training.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.training.module.PaymentModule;
import com.training.request.RequestPayment;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new PaymentModule());

        RequestPayment requestPayment = injector.getInstance(RequestPayment.class);
        requestPayment.processCardPayment();
        requestPayment.processCashPayment();
    }
}
