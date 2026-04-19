package com.n11.bootcamp.payment.main.service;

import com.n11.bootcamp.payment.main.interfaces.PaymentMethod;

public class PaymentService {

    private PaymentMethod paymentMethod;

    public PaymentService (PaymentMethod paymentMethod)
    {
        this.paymentMethod = paymentMethod;
    }

    public boolean processPayment(double amount) {
        return paymentMethod.pay(amount);
    }

}
