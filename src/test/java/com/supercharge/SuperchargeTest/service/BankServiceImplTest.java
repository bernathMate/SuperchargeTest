package com.supercharge.SuperchargeTest.service;

import com.supercharge.SuperchargeTest.exception.DepositTransactionException;
import com.supercharge.SuperchargeTest.exception.NegativeDepositException;
import com.supercharge.SuperchargeTest.model.Account;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class BankServiceImplTest {

    BankService bankService = null;
    Account a = null;
    Account b = null;
    Account c = null;

    @Before
    public void setup() {
        bankService = new BankServiceImpl();
        a = new Account("1", 10000.0);
        b = new Account("2", 20000.0);
        c = new Account("3", 30000.0);
    }

    @Test
    public void testDepositToAccountWithNegativeDeposit() {
        setup();
        assertThrows(NegativeDepositException.class,
                () -> {
                    bankService.depositToAccount(a, -3000.0);
                });
    }

    @Test
    public void testDepositToAccountWithValidData() throws DepositTransactionException, NegativeDepositException {
        setup();
        double moneyBeforeTheDeposit = a.getBalance();
        bankService.depositToAccount(a, 1200.0);
        Assert.assertEquals(a.getBalance(), moneyBeforeTheDeposit + 1200.0 , 0);
    }
}