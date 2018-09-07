package com.supercharge.SuperchargeTest.Service;

import com.supercharge.SuperchargeTest.Exception.DecreaseBalanceException;
import com.supercharge.SuperchargeTest.Exception.DepositTransactionException;
import com.supercharge.SuperchargeTest.Exception.TransferTransactionException;
import com.supercharge.SuperchargeTest.Exception.WithdrawalTransactionException;
import com.supercharge.SuperchargeTest.Model.Account;
import com.supercharge.SuperchargeTest.Model.Transaction;
import com.supercharge.SuperchargeTest.Model.TransactionType;

public class BankServiceImpl implements BankService {
    @Override
    public void depositToAccount(Account account, Transaction transaction) throws DepositTransactionException {
        if (transaction.getTransactionType() != TransactionType.DEPOSIT) {
            throw new DepositTransactionException("In this case just the Deposit transaction is allowed!");
        }

        account.increaseBalance(transaction.getAmountOfMoney());
        account.getTransactionHistory().add(transaction);
    }

    @Override
    public void withdrawalFromAccount(Account account, Transaction transaction) throws WithdrawalTransactionException {
        if (transaction.getTransactionType() != TransactionType.WITHDRAWAL) {
            throw new WithdrawalTransactionException("In this case just the Withdrawal transaction is allowed!");
        }

        try {
            account.decreaseBalance(transaction.getAmountOfMoney());
            account.getTransactionHistory().add(transaction);
        } catch (DecreaseBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void transferToAccountFromOtherAccount(Account accountFrom, Account accountTo, Transaction transaction) throws TransferTransactionException {
        if (transaction.getTransactionType() != TransactionType.TRANSFER) {
            throw new TransferTransactionException("In this case just the Transfer transaction is allowed!");
        }

        try {
            accountFrom.decreaseBalance(transaction.getAmountOfMoney());
            accountTo.increaseBalance(transaction.getAmountOfMoney());
            accountFrom.getTransactionHistory().add(transaction);
        } catch (DecreaseBalanceException e) {
            System.out.println(e.getMessage());
        }

    }
}
