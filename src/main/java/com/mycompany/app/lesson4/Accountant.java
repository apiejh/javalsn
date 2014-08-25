package com.mycompany.app.lesson4;

/**
 * Created by grzegorzaperlinski on 25.08.2014.
 */
public class Accountant {
    private int wage;
    private int walletBalance;

    public Accountant(int wage) {
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


    public void receiveBonus() {
        walletBalance = walletBalance + wage * 4;
    }
}
