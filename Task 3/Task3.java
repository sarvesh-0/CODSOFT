import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false; 
        }
        balance = balance - amount;
        return true; 
    }

    public double checkBalance() {
        return balance;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(10000.0); 

        while (true) {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            System.out.println("---------------------------------------------------------------------");

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to be deposited: Rs");
                    double d = sc.nextDouble();
                    userAccount.deposit(d);
                    System.out.println("Deposited Successfully Rs" + d);
                    System.out.println("---------------------------------------------------------------------");
                    break;

                case 2:
                    System.out.print("Enter the amount to be withdrawn: Rs.");
                    double w = sc.nextDouble();
                    boolean withdrawalSuccess = userAccount.withdraw(w);
                    if (withdrawalSuccess) {
                        System.out.println("Withdrawal of Rs" + w + " successfully done.");
                        System.out.println("---------------------------------------------------------------------");
                    } else {
                        System.out.println("Insufficient balance for withdrawal.");
                        System.out.println("---------------------------------------------------------------------");
                    }
                    break;

                case 3:
                    double b = userAccount.checkBalance();
                    System.out.println("Account balance is: Rs" + b);
                    System.out.println("---------------------------------------------------------------------");
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    System.out.println("---------------------------------------------------------------------");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please choose a correct option.");
                    System.out.println("---------------------------------------------------------------------");
            }
        }
    }
}
