import java.util.Scanner;

class BankAccount {
    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balance;

    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter depositor name: ");
        depositorName = scanner.nextLine();
        System.out.print("Enter account number: ");
        accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter account type: ");
        accountType = scanner.nextLine();

        System.out.println("Account Created Successfully!");

        balance = 0.0; // Initialize balance to 0
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void inquireBalance() {
        System.out.printf("Balance: $%.2f%n", balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Inquire Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.createAccount();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    scanner.nextLine();
                    break;
                case 4:
                    account.inquireBalance();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}