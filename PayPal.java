public class PayPal extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid $"+ amount +" using Paypal");
    }
}
