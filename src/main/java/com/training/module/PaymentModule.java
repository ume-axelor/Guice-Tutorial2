package com.training.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.training.service.CardPaymentService;
import com.training.service.CashPaymentService;
import com.training.service.PaymentService;

public class PaymentModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PaymentService.class)
            .annotatedWith(Names.named("CardPayment"))
            .to(CardPaymentService.class);

        bind(PaymentService.class)
            .annotatedWith(Names.named("CashPayment"))
            .to(CashPaymentService.class);
    }
}
