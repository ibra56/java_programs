public class PaymentTest {
    public static void main(String[] args){
        PaymentMethod a;
        a = new PayPal();
        a.pay(5000);

        a = new CreditCard();
        a.pay(40000);
    }
}
