package services;
public class Account {

    private final int number;
    private String holder;
    private double balance;

    /*Constructor methods*/
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;

    }
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    /*getters & setters*/
    public double getAccNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

        public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        this.balance -= amount+5;
    }

    public String toString() {
        return "Account "
                + number
                +", Holder: "
                + holder
                +", Balance: $"
                + String.format("%.2f", balance);
    }

}