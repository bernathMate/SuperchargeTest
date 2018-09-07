package com.supercharge.SuperchargeTest.service;

import com.supercharge.SuperchargeTest.model.Account;
import com.supercharge.SuperchargeTest.model.TransactionType;

public interface AccountService {

    void printAccountTransactionHistory(Account account);

    void printAccountTransactionsByTransactionType(Account account, TransactionType transactionType);
}
