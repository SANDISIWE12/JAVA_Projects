public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    
    public Account(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " successfully.");
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Amount must be positive.");
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " successfully.");
        }
    }

    
    public void showInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: $" + balance);
    }
}