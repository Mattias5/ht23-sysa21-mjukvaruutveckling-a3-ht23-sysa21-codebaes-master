package se.lu.ics;

public class BankAccount {
    private String accountNumber;
    private double balance;

//empty constructor
    public BankAccount() {
    }
//constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

//deposit method
    public void deposit(double amount) {
        balance = balance + amount;
    }
//withdraw method
    public void withdraw(double amount) {
        balance = balance - amount;
        if (amount <= 0.5 * balance) {
            balance = balance - amount;
        }
        else {}
    }  

//getters and setters
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


}
