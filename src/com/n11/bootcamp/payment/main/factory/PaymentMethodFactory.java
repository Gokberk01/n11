package com.n11.bootcamp.payment.main.factory;

import com.n11.bootcamp.payment.main.interfaces.PaymentMethod;

public class PaymentMethodFactory {


    public PaymentMethod create(String className) {
        try {

            Class<?> paymentModel = Class.forName("com.n11.bootcamp.payment.main.models." + className);
            @Deprecated
            PaymentMethod paymentMethod = (PaymentMethod) paymentModel.newInstance();

            return paymentMethod;
        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }


    }

}
