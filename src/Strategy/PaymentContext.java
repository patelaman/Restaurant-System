package Strategy;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void createPayment(double amount, int numberOfPeople) {
        paymentStrategy.pay(amount, numberOfPeople);
    }
}
