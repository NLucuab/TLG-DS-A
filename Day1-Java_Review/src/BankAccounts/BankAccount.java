package BankAccounts;

public class BankAccount {
    // fields
    //protected double balance;
    private double balance;
    // protected fields can be accessed by inherited members

    // default constructor
    public BankAccount() {
        balance = 0.0;
        //System.out.println("Bank Account Constructor is called");
    }

    // other constructor (w/parameter)
    public BankAccount(double initialAmount){
        balance = initialAmount;
    }

    // business methods
    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    public double getBalance(){
        return balance;
    }

    public void transfer(BankAccount other, double amount){
        if (amount > balance) {
            System.out.println("Transfer is incomplete, due to desired amount being greater than available balance. " +
                    "This will cause an overdraft.");
        }else{
            this.withdraw(amount);
            other.deposit(amount);
            System.out.println("Transfer Complete");
        }

    }

    @Override
    public String toString() {
        return "Bank Account: $" + getBalance();
    }
}