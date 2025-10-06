import FactoryMethodPaymentChallenge.BankTransferCreator;
import FactoryMethodPaymentChallenge.CreditCardCreator;
import FactoryMethodPaymentChallenge.PayPalCreator;
import FactoryMethodPaymentChallenge.PaymentServiceCreator;

public class Main {
    public static void main(String[] args) {
      PaymentServiceCreator payment;

        payment = new PayPalCreator();
        payment.process(150.00);

        payment = new BankTransferCreator();
        payment.process(250.00);

        payment = new CreditCardCreator();
        payment.process(350.00);

    }
}