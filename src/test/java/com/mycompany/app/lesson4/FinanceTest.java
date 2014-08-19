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
    public void shouldPayMinerBasedOnWage() {
        Miner miner = new Miner(7);
        Finance finance = new Finance();

        finance.payDailyWage(miner);

        Assert.assertEquals(56, miner.getWalletBalance());
    }
}