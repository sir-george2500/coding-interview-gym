public class PaymentServices {
    private PaymentGateway paymentGateway;

    public PaymentServices(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(String accountId, double amount) {
        return paymentGateway.processPayment(accountId, amount);
    }
}
