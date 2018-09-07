package com.supercharge.SuperchargeTest.model;

import java.util.Date;

public class Transaction {

    private final Date transactionDate;
    private final Double amountOfMoney;
    private final TransactionType transactionType;

    public Transaction(Double amountOfMoney, TransactionType transactionType) {
        this.transactionDate = new Date();
        this.amountOfMoney = amountOfMoney;
        this.transactionType = transactionType;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public Double getAmountOfMoney() {
        return amountOfMoney;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionDate=" + transactionDate +
                ", amountOfMoney=" + amountOfMoney +
                ", transactionType=" + transactionType +
                '}';
    }
}
