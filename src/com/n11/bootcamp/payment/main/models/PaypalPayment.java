package com.n11.bootcamp.payment.main.models;

import com.n11.bootcamp.payment.main.interfaces.PaymentMethod;

public class PaypalPayment implements PaymentMethod {

    @Override
    public boolean pay(double amount) {
        System.out.println("The " + amount + "$ bill paid via Paypal.");
        return true;
    }

}
