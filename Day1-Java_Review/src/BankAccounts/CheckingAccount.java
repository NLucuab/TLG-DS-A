package BankAccounts;

public class CheckingAccount extends BankAccount{
    // Checking Account "is a" Bank Account

    private int transactionCount;

    public CheckingAccount(){
        transactionCount = 0;
        //System.out.println("Checking Account Constructor is called.");
    }

    public CheckingAccount(double initialAmount) {
        super(initialAmount);
        //balance = initialAmount;
        transactionCount = 0;
    }

    // after 10 transactions, we'll have a deposit or withdrawal fee
    // Polymorphism is utilized when a method is redefined in the subclass/child class from the parent class.

    public void deposit(double amount){
        super.deposit(amount);
        transactionCount++; // increment by 1
    }

    public void withdraw(double amount){
        super.withdraw(amount);
        transactionCount++;
    }

    public int getTransactionCount(){
        return transactionCount;
    }

    public void deductFees(){
        if (transactionCount > 10){
            double fee = transactionCount * .10;
            super.withdraw(fee);
            this.deposit(20);
        }
    }
    @Override
    public String toString() {
        return "Checking Account: $" + getBalance();
    }

}