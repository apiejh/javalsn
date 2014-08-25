package com.mycompany.app.lesson4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FinanceTest {
    @Test
    public void shouldPayMiner() {
        Miner miner = new Miner(14);
        Finance finance = new Finance();

        finance.payDailyWage(miner);

        Assert.assertEquals(112, miner.getWalletBalance());
    }

    @Test
    public void shouldPayAccountant() {
        Accountant accountant = new Accountant(20);
        Finance finance = new Finance();

        finance.payDailyWage(accountant);

        Assert.assertEquals(160, accountant.getWalletBalance());
    }

    @Test
    public void shouldPayMinerBasedOnWage() {
        Miner miner = new Miner(7);
        Finance finance = new Finance();

        finance.payDailyWage(miner);

        Assert.assertEquals(56, miner.getWalletBalance());
    }

    @Test
    public void shouldPayAccountantBasedOnWage() {
        Accountant accountant = new Accountant(40);
        Finance finance = new Finance();

        finance.payDailyWage(accountant);

        Assert.assertEquals(320, accountant.getWalletBalance());
    }

    @Test
    public void shouldGiveBonusToAccountant() {
        Accountant accountant = new Accountant(10);
        Finance finance = new Finance();

        finance.giveBonus(accountant);

        Assert.assertEquals(40, accountant.getWalletBalance());
    }
}