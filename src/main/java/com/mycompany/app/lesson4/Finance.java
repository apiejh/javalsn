package com.mycompany.app.lesson4;

/**
 * Created by grzegorzaperlinski on 19.08.2014.
 */
public class Finance {
    public void payDailyWage(Miner miner) {
        miner.receivePayment(8);
    }

    public void payDailyWage(Accountant accountant) {
        accountant.receivePayment(8);
    }

    public void giveBonus(Accountant accountant) {
        accountant.receiveBonus();
    }
}
