import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    
    public void createAccount(String accountNumber, String ownerName) {
        accounts.add(new Account(accountNumber, ownerName));
        System.out.println("Account created successfully!");
    }

    
    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        System.out.println("Account not found!");
        return null;
    }

    
    public void showAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Account acc : accounts) {
                acc.showInfo();
                System.out.println("-----------------");
            }
        }
    }
}