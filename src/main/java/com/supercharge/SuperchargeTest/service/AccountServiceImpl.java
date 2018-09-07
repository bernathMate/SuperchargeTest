package com.supercharge.SuperchargeTest.service;

import com.supercharge.SuperchargeTest.model.Account;
import com.supercharge.SuperchargeTest.model.Transaction;
import com.supercharge.SuperchargeTest.model.TransactionType;

public class AccountServiceImpl implements AccountService {
    @Override
    public void printAccountTransactionHistory(Account account) {
        if (account.getTransactionHistory().isEmpty()) {
            System.out.println("There is no transaction yet!");
            return;
        }

        for(Transaction transaction : account.getTransactionHistory()) {
            System.out.println(transaction.toString());
        }
    }

    @Override
    public void printAccountTransactionsByTransactionType(Account account, TransactionType transactionType) {
        if (account.getTransactionHistory().isEmpty()) {
            System.out.println("There is no transaction yet!");
            return;
        }

        for(Transaction transaction : account.getTransactionHistory()) {
            if (transaction.getTransactionType() == transactionType) {
                System.out.println(transaction.toString());
            }
        }
    }
}
