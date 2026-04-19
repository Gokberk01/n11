package com.n11.bootcamp.payment.test;

import com.n11.bootcamp.payment.main.factory.PaymentMethodFactory;
import com.n11.bootcamp.payment.main.interfaces.PaymentMethod;
import com.n11.bootcamp.payment.main.models.CreditCardPayment;
import com.n11.bootcamp.payment.main.services.PaymentService;

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
            int amount = scan.nextInt();


            PaymentMethodFactory paymentMethodFactory = new PaymentMethodFactory();
            PaymentMethod paymentMethod = paymentMethodFactory.create(paymentMethodInput);
            PaymentService paymentService = new PaymentService(paymentMethod);

            boolean isPaymentSuccessful = paymentService.processPayment(amount);

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
