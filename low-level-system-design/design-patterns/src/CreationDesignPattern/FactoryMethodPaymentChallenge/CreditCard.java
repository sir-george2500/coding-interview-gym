package CreationDesignPattern.FactoryMethodPaymentChallenge;

public class CreditCard implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Credit Card.");
    }
}
