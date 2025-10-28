public class OrangePayAdapter implements PaymentGateway {
    private OrangePay orangePay;

    OrangePayAdapter(){
        this.orangePay = new OrangePay();
    }

    @Override
    public boolean processPayment(String userid,double amount) {
        orangePay.makePayment(userid ,amount);
        return true;
    }
}
