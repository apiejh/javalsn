package com.mycompany.app.lesson4;

/**
 * Created by grzegorzaperlinski on 19.08.2014.
 */
public class Finance {
    public void payDailyWage(Miner miner) {
        int money = miner.getWage() * 8;
        miner.getPaid(money);
    }
}
