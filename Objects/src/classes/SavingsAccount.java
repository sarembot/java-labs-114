package classes;

public class SavingsAccount extends Account {
    private double annualInterestRate;

    public SavingsAccount(int id, double balance, Client client, double annualInterestRate) {
        super(id, balance, client);
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAnnual Interest Rate: " + annualInterestRate;
    }

}
