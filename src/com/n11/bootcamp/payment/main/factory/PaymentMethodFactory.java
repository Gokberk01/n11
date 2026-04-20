package com.n11.bootcamp.payment.main.factory;

import com.n11.bootcamp.payment.main.interfaces.PaymentMethod;

public class PaymentMethodFactory {


    public PaymentMethod create(String className) {
        try {

            // We are using Reflection here.

            // Construct the full class name dynamically at runtime.
            // Example: if className = "CreditCard",
            // this becomes: "com.n11.bootcamp.payment.main.model.CreditCardPayment"
            Class<?> paymentModel = Class.forName("com.n11.bootcamp.payment.main.model." + className + "Payment");

            // Create a new instance of the class dynamically at runtime.
            // newInstance() calls the default (no-argument) constructor.
            // The created object is cast to the PaymentMethod interface.
            @Deprecated
            PaymentMethod paymentMethod = (PaymentMethod) paymentModel.newInstance();

            // Return the dynamically created PaymentMethod object
            return paymentMethod;

        } catch (Exception e) {

            // If the class is not found, cannot be instantiated,
            // or any other exception occurs, print the stack trace
            e.printStackTrace();

            // Return null in case of failure
            return null;
        }

    }

}
