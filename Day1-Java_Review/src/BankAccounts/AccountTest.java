package BankAccounts;

public class AccountTest {
    public static void  main(String[] args) {

        BankAccount generalAccount = new BankAccount();

        BankAccount savings = new BankAccount(100.0);

        //System.out.println("Savings Account Balance: $" + savings.getBalance());

        generalAccount.deposit(145);

        //System.out.println("General Account Balance: $" + generalAccount.getBalance());

        //generalAccount.transfer(savings, 40.00);

        //System.out.println("Savings Account Balance: $" + savings.getBalance());

        //System.out.println("General Account Balance: $" + generalAccount.getBalance());

        CheckingAccount firstAccount = new CheckingAccount();

        firstAccount.deposit(34.00);

        //System.out.println("Checking Account Balance: $" + firstAccount.getBalance());

        firstAccount.deposit(100);

        //System.out.println("General Account Balance: $" + generalAccount.getBalance());

        //generalAccount.transfer(firstAccount, 40);

        //System.out.println("General Account Balance: $" + generalAccount.getBalance());
        //System.out.println("Checking Account Balance: $" + firstAccount.getBalance());

        CheckingAccount schoolSpending = new CheckingAccount();
        //System.out.println("Checking Account: $" + schoolSpending.getBalance());
        schoolSpending.deposit(100.00);

        System.out.println("Checking Account: $" + schoolSpending.getBalance());
        System.out.println(schoolSpending);
        System.out.println("Transaction count: " + schoolSpending.getTransactionCount());

        SavingsAccount saveVacation = new SavingsAccount(1, 100);
        //System.out.println("Savings Day 1: $" + saveVacation.getBalance());
        saveVacation.addInterest();
        //System.out.println("Savings Day 2: $" + saveVacation.getBalance());

        saveVacation.transfer(schoolSpending, 10);
        System.out.println("School Spending Account: $" + schoolSpending.getBalance());
    }

}

