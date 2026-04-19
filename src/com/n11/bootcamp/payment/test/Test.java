package com.n11.bootcamp.payment.test;

import com.n11.bootcamp.payment.main.CreditCardPayment;
import com.n11.bootcamp.payment.main.PaymentService;

public class Test {
    public static void main(String[] args)
    {
        PaymentService paymentService = new PaymentService(new CreditCardPayment());
        paymentService.processPayment(4700);
    }
}
