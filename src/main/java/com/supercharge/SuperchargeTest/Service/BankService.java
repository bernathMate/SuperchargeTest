package com.supercharge.SuperchargeTest.Service;

import com.supercharge.SuperchargeTest.Exception.DepositTransactionException;
import com.supercharge.SuperchargeTest.Exception.TransferTransactionException;
import com.supercharge.SuperchargeTest.Exception.WithdrawalTransactionException;
import com.supercharge.SuperchargeTest.Model.Account;
import com.supercharge.SuperchargeTest.Model.Transaction;

public interface BankService {

    void depositToAccount(Account account, Transaction transaction) throws DepositTransactionException;

    void withdrawalFromAccount(Account account, Transaction transaction) throws WithdrawalTransactionException;

    void transferToAccountFromOtherAccount(Account accountFrom, Account accountTo, Transaction transaction) throws TransferTransactionException;
}
