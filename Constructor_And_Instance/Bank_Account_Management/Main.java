package Bank_Account_Management;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("1234567890", "Ravi Kumar", 5000.00);
        account1.displayAccountInfo();
        System.out.println();


        account1.deposit(1500);
        account1.withdraw(2000);
        System.out.println();

        // Create SavingsAccount object
        SavingsAccount savAcc = new SavingsAccount("9876543210", "Anjali Mehta", 10000.00, 3.5);
        savAcc.displayAccountInfo();
        System.out.println();
        savAcc.displaySavingsAccountInfo();
    }
}
