public class ModularCodeExample {
    public static void main(String[] args){
        Module logIn = new LoginModule();
        Module paymentModule = new PaymentModule();

        logIn.performAction();
        paymentModule.performAction();
    }
}
