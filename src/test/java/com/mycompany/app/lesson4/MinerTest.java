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
    public void shouldReceivePaymentBasedOnHoursAndWage() {
        Miner miner = new Miner(10);

        miner.receivePayment(8);

        Assert.assertEquals(80, miner.getWalletBalance());
    }

    @Test
    public void shouldReceiveMultiplePaymentsBasedOnHoursAndWage() {
        Miner miner = new Miner(12);

        miner.receivePayment(10);
        miner.receivePayment(5);

        Assert.assertEquals(180, miner.getWalletBalance());
    }
}