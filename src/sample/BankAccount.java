package sample;

public class BankAccount {

    public static final double DEFAULT_INTEREST_RATE = 0.01;
    private int accNumber;
    private double balance;
    private double interestRate;

    public BankAccount(int accNumber) {
        accNumber = this.accNumber;
        interestRate = DEFAULT_INTEREST_RATE;
        balance = 0.0;
    }

    public BankAccount(int accNumber, double initialBalance) {
        this.balance = initialBalance;
        this.accNumber = accNumber;
        interestRate = DEFAULT_INTEREST_RATE;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void addInterest() {
        balance = (balance * (interestRate + 1));
    }
}

