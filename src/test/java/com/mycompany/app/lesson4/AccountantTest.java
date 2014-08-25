package com.mycompany.app.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by grzegorzaperlinski on 25.08.2014.
 */
public class AccountantTest {

    @Test
    public void shouldTellAboutHisWage() {
        Accountant accountant = new Accountant(30);

        Assert.assertEquals(30, accountant.getWage());
    }

    @Test
    public void shouldHaveEmptyWalletAtBeginning() {
        Accountant accountant = new Accountant(40);

        Assert.assertEquals(0, accountant.getWalletBalance());
    }

    @Test
    public void shouldFillWallet() {
        Accountant accountant = new Accountant(45);

        accountant.getPaid(10);

        Assert.assertEquals(10, accountant.getWalletBalance());
    }

    @Test
    public void shouldAddUpPay() {
        Accountant accountant = new Accountant(15);

        accountant.getPaid(10);
        accountant.getPaid(8);

        Assert.assertEquals(18, accountant.getWalletBalance());
    }

    @Test
    public void shouldBeAbleToReceiveBonus() {
        Accountant accountant = new Accountant(20);

        accountant.receiveBonus();

        Assert.assertEquals(80, accountant.getWalletBalance());
    }
}
