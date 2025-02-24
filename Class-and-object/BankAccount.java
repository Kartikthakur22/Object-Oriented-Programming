public class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;
    public BankAccount(String accountHolder,long accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>=0){
            balance+=amount;
            System.out.println("Rs "+amount+" deposited");
        }else{
            System.out.println("Enter a positive value");
        }
    }
    public void withdraw(double amount){
        if(amount>=0){
            if(balance>=amount){
                balance-=amount;
                System.out.println("Rs "+amount+" withdrawn");
            }
            else{
                System.out.println("Balance is less than the amount you are withdrawing");
            }
        }else{
            System.out.println("Enter a positive value");
        }
    }
    public void displayDetails(){
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Balance : Rs "+balance);
    }
    public static void main(String[] args) {
        BankAccount bankAccount1=new BankAccount("Kartik", 19345262, 10000);
        bankAccount1.deposit(5000);
        bankAccount1.withdraw(1000);
        bankAccount1.displayDetails();
    }
}
