package com.n11.bootcamp.payment.test;

import com.n11.bootcamp.payment.main.factory.PaymentMethodFactory;
import com.n11.bootcamp.payment.main.interfaces.PaymentMethod;
import com.n11.bootcamp.payment.main.service.PaymentService;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        try
        {

            //PaymentService paymentService = new PaymentService(new CreditCardPayment());
            //paymentService.processPayment(4700);

            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter the payment method : ");
            String paymentMethodInput = scan.nextLine();

            System.out.println("Please enter your amount to pay : ");
            double amount = scan.nextDouble();

            //----------- Reflection
            Class<?> cls = Class.forName("com.n11.bootcamp.payment.main.factory.PaymentMethodFactory");
            Object paymentMethodObject = cls.getDeclaredConstructor().newInstance();
            Class[] paramString = new Class[1];
            paramString[0] = String.class;
            Method methodCreate = cls.getMethod("create", paramString);
            Object paymentMethodFactoryObject = methodCreate.invoke(paymentMethodObject, paymentMethodInput);
            //------------

            //PaymentMethodFactory paymentMethodFactory = new PaymentMethodFactory();
            //PaymentMethod paymentMethod = paymentMethodFactory.create(paymentMethodInput);

            boolean isPaymentSuccessful = false;

            if(paymentMethodFactoryObject != null)
            {
                PaymentService paymentService = new PaymentService((PaymentMethod) paymentMethodFactoryObject);

                isPaymentSuccessful = paymentService.processPayment(amount);
            }


            if(isPaymentSuccessful)
            {
                System.out.println("Successful Operation.");
            }


        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }


    }
}
