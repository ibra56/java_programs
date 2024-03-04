public class AccountTest {
    public static void main(String[] args){
        Account account1;
        account1 = new IbraAccount();
        account1.deposit(5000);
        account1.withDraw(2000);
        double balance = account1.getBalance();
        System.out.println("You account balance is $"+ balance);


    }
}
