package com.apoorva;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    @DisplayName("Withdrawed")
    public void testWithdraw()
    {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(300);
        assertEquals(200,bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposited")
    public void testDeposit()
    {
        BankAccount bankAccount = new BankAccount(400,0);
        bankAccount.deposit(500);
        assertEquals(900,bankAccount.getBalance());
    }
}
