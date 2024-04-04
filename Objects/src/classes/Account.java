package classes;
import java.util.Date;
import java.util.ArrayList;

public class Account {
    private int id;
    private double balance;
    private Date dateCreated;
    private Client client;
    private ArrayList<Transaction> transactions;

    public Account(int id, double balance, Client client) {
        this.id = id;
        this.balance = balance;
        this.client = client;

        this.transactions = new ArrayList<>();
        dateCreated = new Date();
    }

    public boolean withdraw(double amount) {
        if (amount <= balance){
            balance -= amount;
            this.transactions.add(new Transaction('W', amount, balance, "Transaction successful. " + amount + " withdrawn."));
            return true;
        } else
            return false;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "Deposit successful."));
    }

    @Override
    public String toString(){
        return "\n" + "\nID: " + getId() + "\nBalance: " + getBalance() + "\nDate Created: " + getDateCreated() + "\n\n";
    }

    public int countTransactions(char type) {
        int count = 0;
        for (Transaction transaction : transactions){
            if(transaction.getType() == type)
            count ++;
        }
        return count;
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

    public Date getDateCreated() {
        return this.dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
