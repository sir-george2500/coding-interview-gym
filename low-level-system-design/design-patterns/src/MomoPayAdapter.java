public class MomoPayAdapter implements  PaymentGateway {
    private MomoPay momoPay;

    public MomoPayAdapter() {
        this.momoPay = new MomoPay();
    }

    @Override
    public boolean processPayment(String userid, double amount) {
        momoPay.sendMoney(userid, amount);
        return true;
    }


}
