package accounttest;

public class AccountTest {

    public static void main(String[] args) {

 // Create an Account object with id of 1122, a balance of $20,000, and an annual interest rate of 4.5%
        Account account = new Account(1122, 20000);

        System.out.println("Initial Account Details:");
        System.out.println("Account ID: " + account.getId());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Annual Interest Rate: " + (account.getAnnualInterestRate() * 100) + "%");
        System.out.println("Date Created: " + account.getDateCreated());

        // Withdraw $2,500
        account.withdraw(2500);
        System.out.println("\nAfter Withdrawing $2,500:");
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest Rate: " + (account.getMonthlyInterestRate() * 100) + "%");

        // Deposit $3,000
        account.deposit(3000);
        System.out.println("\nAfter Depositing $3,000:");
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest Rate: " + (account.getMonthlyInterestRate() * 100) + "%");
        
    }
    
}
