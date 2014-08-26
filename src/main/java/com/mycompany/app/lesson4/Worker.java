package com.mycompany.app.lesson4;

/**
 * Created by grzegorzaperlinski on 26.08.2014.
 */
public abstract class Worker {
    protected int wage;
    protected int walletBalance;

    public int getWage() {
        return wage;
    }

    public int getWalletBalance() {
        return walletBalance;
    }

    public void receivePayment(int hours) {
        walletBalance += wage * hours;
    }
}
