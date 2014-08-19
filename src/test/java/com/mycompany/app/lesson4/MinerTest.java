package com.mycompany.app.lesson4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinerTest {

    @Test
    public void shouldTellAboutHisWage() {
        Miner miner = new Miner(20);

        Assert.assertEquals(20, miner.getWage());

    }

    @Test
    public void shouldHaveEmptyWalletAtBeginning() {
        Miner miner = new Miner(10);

        Assert.assertEquals(0, miner.getWalletBalance());
    }

    @Test
    public void shouldFillWallet() {
        Miner miner = new Miner(20);

        miner.getPaid(10);

        Assert.assertEquals(10, miner.getWalletBalance());
    }

    @Test
    public void shouldAddUpPay() {
        Miner miner = new Miner(15);

        miner.getPaid(10);
        miner.getPaid(8);

        Assert.assertEquals(18, miner.getWalletBalance());
    }
}