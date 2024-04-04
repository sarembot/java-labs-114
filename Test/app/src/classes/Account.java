package classes;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        
        dateCreated = new Date(); // by default contains current date/time
        
    }

    public boolean withdraw (double amount) {
        if (amount <= balance){
            balance -= amount;
            return true;
        }
            return false;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    public Date getDateCreated() {
        return this.dateCreated;
    }

    public String toString(){
        return this.id + " " + this.balance + " " + this.annualInterestRate + " " + this.dateCreated;
    }



}
