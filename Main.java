import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Simple Bank Manager ---");
            System.out.println("1. Create account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View account balance");
            System.out.println("5. Show all accounts");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String number = scanner.nextLine();
                    System.out.print("Enter owner name: ");
                    String name = scanner.nextLine();
                    bank.createAccount(number, name);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    number = scanner.nextLine();
                    Account acc = bank.findAccount(number);
                    if (acc != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        acc.deposit(amount);
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    number = scanner.nextLine();
                    acc = bank.findAccount(number);
                    if (acc != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        acc.withdraw(amount);
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    number = scanner.nextLine();
                    acc = bank.findAccount(number);
                    if (acc != null) {
                        acc.showInfo();
                    }
                    break;
                case 5:
                    bank.showAllAccounts();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }

        scanner.close();
    }
}