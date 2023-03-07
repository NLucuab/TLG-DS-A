package BankAccounts;

public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(double rate){
        // this constructor calls on the default bankAccount constructor
        interestRate = rate;
    }

    public SavingsAccount(double rate, double initialAmount){
        super(initialAmount);

        interestRate = rate;
    }

    public void addInterest(){
        double interest = getBalance() * interestRate/100;

        deposit(interest);
    }
}