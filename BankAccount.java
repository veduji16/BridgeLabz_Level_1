package Level_1;

//  Write a Java program to create a class called "BankAccount" with instance variables "balance" and "accountNumber." Include a method to deposit money into the account and a method to withdraw money from the account.

public class BankAccount {
    private double balance;
    private int accountNumber;

    public BankAccount(double bal, int accNum) {
        if (bal >= 0) {
            this.balance = bal;
        } else {
            System.out.println("Error: Initial balance must be non-negative");
        }
        this.accountNumber = accNum;
    }

    public void depositMoney(double amount) {
        System.out.println("Requested amount to deposit: $" + amount);
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit Successful! New Balance: $" + this.balance);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdrawMoney(double amount) {
        System.out.println("\nRequested amount to withdraw: $" + amount);
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdraw Successful! New Balance: $" + this.balance);
        } else if (amount <= 0) {
            System.out.println("Deposit amount must be positive");
        } else {
            System.out.println("Insufficient funds for withdrawl.");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0, 123456789);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance() + "\n");

        account.depositMoney(500.0);
        System.out.println("Current Balance after deposit: $" + account.getBalance());

        account.withdrawMoney(200.0);
        System.out.println("Current Balance after withdrawl: $" + account.getBalance());
    }

}
