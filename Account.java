/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author chand
 */
class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    public Account(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getCustomerName() { return customerName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited $%.2f. New Balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
     public void displayDetails() {
        System.out.printf("Account No : %s%n", accountNumber);
        System.out.printf("Customer   : %s%n", customerName);
        System.out.printf("Balance    : $%.2f%n", balance);
    }
}
class SavingsAccount extends Account {
    private double interestRate; // Annual rate in percentage (e.g., 4.5 for 4.5%)

    public SavingsAccount(String accountNumber, String customerName, double balance, double interestRate) {
        super(accountNumber, customerName, balance);
        this.interestRate = interestRate;
    }
    public double calculateInterest() {
        return (getBalance() * interestRate) / 100;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- SAVINGS ACCOUNT ---");
        super.displayDetails();
        System.out.printf("Interest   : %.2f%% per annum%n", interestRate);
        System.out.printf("Est. Yearly Interest: $%.2f%n", calculateInterest());
    }
}
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String customerName, double balance, double overdraftLimit) {
        super(accountNumber, customerName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public boolean checkOverdraftEligibility(double withdrawalAmount) {
        double maxAvailable = getBalance() + overdraftLimit;
        return withdrawalAmount <= maxAvailable;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- CURRENT ACCOUNT ---");
        super.displayDetails();
        System.out.printf("Overdraft Limit: $%.2f%n", overdraftLimit);
        System.out.printf("Max Withdrawal Possible: $%.2f%n", getBalance() + overdraftLimit);
    }
}
public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SAV-101", "Alice Smith", 5000.00, 4.5);
        savings.displayDetails();
        savings.deposit(1200.00);
        System.out.printf("Updated Annual Interest: $%.2f%n", savings.calculateInterest());
        System.out.println("\n=======");
        CurrentAccount current = new CurrentAccount("CUR-202", "Bob Jones", 1500.00, 2000.00);
        current.displayDetails();
        double requestedAmount1 = 2800.00;
        double requestedAmount2 = 4000.00;
        System.out.printf("%nEligible to withdraw $%.2f? %s%n", 
            requestedAmount1, current.checkOverdraftEligibility(requestedAmount1) ? "Yes" : "No");
        System.out.printf("Eligible to withdraw $%.2f? %s%n", 
            requestedAmount2, current.checkOverdraftEligibility(requestedAmount2) ? "Yes" : "No");
    }
}