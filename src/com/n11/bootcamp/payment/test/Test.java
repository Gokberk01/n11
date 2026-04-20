package com.n11.bootcamp.payment.test;

import com.n11.bootcamp.payment.main.factory.PaymentMethodFactory;
import com.n11.bootcamp.payment.main.interfaces.PaymentMethod;
import com.n11.bootcamp.payment.main.service.PaymentService;

import java.util.Scanner;


public class Test {
    public static void main(String[] args)
    {
        try
        {
            boolean isApplicationRunning = true;

            while(isApplicationRunning)
            {
                Scanner scan = new Scanner(System.in);

                System.out.println("Please enter the payment method : ");
                String paymentMethodInput = scan.nextLine();

                System.out.println("Please enter your amount to pay : ");
                double amount = scan.nextDouble();


                PaymentMethodFactory paymentMethodFactory = new PaymentMethodFactory();
                PaymentMethod paymentMethod = paymentMethodFactory.create(paymentMethodInput);

                boolean isPaymentSuccessful = false;

                if (paymentMethod != null) {
                    PaymentService paymentService = new PaymentService(paymentMethod);

                    isPaymentSuccessful = paymentService.processPayment(amount);
                }

                if (isPaymentSuccessful) {
                    System.out.println("Successful Operation.");
                    Thread.sleep(1000);
                }


                while(true)
                {
                    System.out.println("If you want to exit the application please enter 0, Otherwise please enter 1 : ");
                    String isUserWantToExit = scan.next();

                    if (isUserWantToExit.equals("0"))
                    {
                        isApplicationRunning = false;
                        break;
                    }
                    else if(isUserWantToExit.equals("1"))
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Please enter a valid number !");
                        Thread.sleep(700);
                    }
                }
            }

        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }


    }
}
