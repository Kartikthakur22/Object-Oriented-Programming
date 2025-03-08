package Inheritance;

class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public void displayAccountType() {
        System.out.println("Account Type: General Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int tenure;  // in years

    public FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Tenure: " + tenure + " years");
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("SA12345", 5000.0, 4.5);
        BankAccount checkingAccount = new CheckingAccount("CA67890", 1000.0, 2000.0);
        BankAccount fixedDepositAccount = new FixedDepositAccount("FD11223", 10000.0, 5);

        System.out.println("Savings Account Info:");
        savingsAccount.displayAccountInfo();
        savingsAccount.displayAccountType();
        System.out.println();

        System.out.println("Checking Account Info:");
        checkingAccount.displayAccountInfo();
        checkingAccount.displayAccountType();
        System.out.println();

        System.out.println("Fixed Deposit Account Info:");
        fixedDepositAccount.displayAccountInfo();
        fixedDepositAccount.displayAccountType();
    }
}
