package CreationDesignPattern.FactoryMethodPaymentChallenge;

public class BankTransferCreator extends PaymentServiceCreator {
    @Override
    public PaymentService createPaymentService() {
        return new BankTransfer();
    }
}
