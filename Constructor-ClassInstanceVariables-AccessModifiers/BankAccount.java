public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Balance: " + this.balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Balance: " + this.getBalance());
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", "John Doe", 1000.50);
        account1.displayAccountDetails();
        account1.setBalance(1200.75);
        
        account1.displayAccountDetails();

        SavingsAccount savingsAccount1 = new SavingsAccount("987654321", "Jane Smith", 2000.30);
        savingsAccount1.displaySavingsAccountDetails();
    }
}
