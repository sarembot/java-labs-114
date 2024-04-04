package classes;
import java.util.Date;

public class Transaction {
    private char type;
    private double amount;
    private double balance;
    private Date date;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;

        this.date = new Date();

    }

    public char getType() {
        return this.type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
