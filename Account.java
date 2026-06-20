package accounttest;

import java.util.Date;

public class Account {
    
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // No-arg constructor
    public Account() {
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
    }

    // Constructor with specified id and initial balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
    }

    // Accessor methods for id, balance, and annualInterestRate
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }

    // Accessor method for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    // Method to get monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    
    }
}