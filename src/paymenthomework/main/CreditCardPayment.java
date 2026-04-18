package paymenthomework.main;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public boolean pay(double amount) {
        System.out.println("The " + amount + "$ bill paid via Credit Card.");
        return true;
    }
}

