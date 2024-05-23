package model.entities;

import model.exceptions.BusinessException;

public class Account {

    private Integer accNumber;
    private String holderName;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer accNumber, String holderName, Double balance, Double withdrawLimit) {
        this.accNumber = accNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(Integer accNumber) {
        this.accNumber = accNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }


    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        validateWithdraw(amount);
        this.balance -= amount;
    }

    private void validateWithdraw(Double amount) {
        if(amount > getWithdrawLimit()) {
            throw new BusinessException("Withdraw limit exceeded");
        }
        if (amount > getBalance()) {
            throw new BusinessException("Insufficient balance");
        }
    }
}
