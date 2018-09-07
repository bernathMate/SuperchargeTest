package com.supercharge.SuperchargeTest.Model;

import com.supercharge.SuperchargeTest.Exception.DecreaseBalanceException;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private final String AccountID;
    private Double Balance;
    private List<Transaction> transactionHistory;

    public Account(String accountID, Double balance) {
        AccountID = accountID;
        Balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    public String getAccountID() {
        return AccountID;
    }

    public Double getBalance() {
        return Balance;
    }

    public void increaseBalance(Double amountOfMoney) {
        this.Balance += amountOfMoney;
    }

    public void decreaseBalance(Double amountOfMoney) throws DecreaseBalanceException {
        if (this.Balance == 0 || this.Balance < amountOfMoney) {
            throw new DecreaseBalanceException("This is not allowed!");
        }

        this.Balance -= amountOfMoney;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }
}
