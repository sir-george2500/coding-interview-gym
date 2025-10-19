package CreationDesignPattern.FactoryMethodPaymentChallenge;

public class CreditCardCreator extends PaymentServiceCreator {
    @Override
    public PaymentService createPaymentService() {
        return new CreditCard();
    }
}
