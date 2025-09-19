class BankAccount {
    
    private String accountNumber;
    private double balance;

    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount should be more than zero.");
        }
    }

    // Withdrawal method
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else if (amount < 0) {
            balance = balance - amount;
            System.out.println("Withdrawal: $" + amount);
        }
    }


    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}


public class Main {
    public static void main(String[] args) {
        
        BankAccount myAccount = new BankAccount("123", 500);

        myAccount.deposit(200.0);
        myAccount.withdraw(100.0);
        myAccount.displayInfo();
    }
}
