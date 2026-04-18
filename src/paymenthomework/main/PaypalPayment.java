package paymenthomework.main;

public class PaypalPayment implements PaymentMethod {

    @Override
    public boolean pay(double amount) {
        System.out.println("The " + amount + "$ bill paid via Paypal.");
        return true;
    }

}
