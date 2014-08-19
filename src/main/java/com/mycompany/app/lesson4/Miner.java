package com.mycompany.app.lesson4;

/**
 * Created by grzegorzaperlinski on 19.08.2014.
 */
public class Miner {
    private int wage;
    private int walletBalance;

    public Miner(int wage) {
        this.wage = wage;
    }

    public int getWage() {
        return wage;
    }

    public int getWalletBalance() {
        return walletBalance;
    }

    public void getPaid(int pay) {
        walletBalance = walletBalance + pay;
    }
}
