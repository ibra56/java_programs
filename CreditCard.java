public class CreditCard extends PaymentMethod{
    @Override
    void pay(double amount) {
        System.out.println("Paid $"+ amount + " using credit card");
    }
}
