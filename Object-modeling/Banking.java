import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void openAccount(Customer customer, double initialDeposit) {
        if (!customers.contains(customer)) {
            System.out.println("Customer not found at the bank.");
            return;
        }
        Account newAccount = new Account(initialDeposit);
        customer.addAccount(newAccount);
        System.out.println("New account opened with an initial deposit of " + initialDeposit);
    }

    public void listCustomers() {
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
        }
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalances() {
        if (accounts.isEmpty()) {
            System.out.println(name + " has no accounts.");
            return;
        }
        for (Account account : accounts) {
            System.out.println("Account balance: $" + account.getBalance());
        }
    }
}

class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class Banking {
    public static void main(String[] args) {
        Bank myBank = new Bank("MyBank");

        Customer john = new Customer("John");
        Customer jane = new Customer("Jane");

        myBank.addCustomer(john);
        myBank.addCustomer(jane);

        myBank.openAccount(john, 1000);
        myBank.openAccount(jane, 500);

        john.viewBalances();
        jane.viewBalances();

        john.viewBalances();
        john.viewBalances();

        myBank.listCustomers();
    }
}
