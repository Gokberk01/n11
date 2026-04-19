package com.n11.bootcamp.payment.main.model;

import com.n11.bootcamp.payment.main.interfaces.PaymentMethod;

public class CashPayment implements PaymentMethod {

    @Override
    public boolean pay(double amount) {
        System.out.println("The " + amount + "$ bill paid via Cash.");
        return true;
    }
}
