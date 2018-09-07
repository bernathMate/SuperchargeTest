package com.supercharge.SuperchargeTest.Model;

public class Account {

    private String AccountID;
    private Double Balance;

    public Account(String accountID, Double balance) {
        AccountID = accountID;
        Balance = balance;
    }

    public String getAccountID() {
        return AccountID;
    }

    public void setAccountID(String accountID) {
        AccountID = accountID;
    }

    public Double getBalance() {
        return Balance;
    }

    public void setBalance(Double balance) {
        Balance = balance;
    }
}
