public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance+=amount;
        }else {
            System.out.println("Invalid amount deposit");
        }
    }
    public void withDraw(double amount){
        if(amount > 0 && amount < balance){
            balance -= amount;
        }else {
            System.out.println("Invalid amount withdraw");
        }
    }
}
