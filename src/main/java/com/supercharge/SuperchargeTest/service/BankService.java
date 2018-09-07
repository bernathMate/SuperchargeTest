package com.supercharge.SuperchargeTest.service;

import com.supercharge.SuperchargeTest.exception.DepositTransactionException;
import com.supercharge.SuperchargeTest.exception.TransferTransactionException;
import com.supercharge.SuperchargeTest.exception.WithdrawalTransactionException;
import com.supercharge.SuperchargeTest.model.Account;
import com.supercharge.SuperchargeTest.model.Transaction;

public interface BankService {

    void depositToAccount(Account account, Transaction transaction) throws DepositTransactionException;

    void withdrawalFromAccount(Account account, Transaction transaction) throws WithdrawalTransactionException;

    void transferToAccountFromOtherAccount(Account accountFrom, Account accountTo, Transaction transaction) throws TransferTransactionException;
}
