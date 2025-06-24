package Bank_Account_Management;

public class SavingsAccount extends BankAccount {
    double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }


    public void displaySavingsAccountInfo() {
        System.out.println("Savings Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolder);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
