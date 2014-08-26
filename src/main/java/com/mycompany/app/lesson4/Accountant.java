package com.mycompany.app.lesson4;

/**
 * Created by grzegorzaperlinski on 25.08.2014.
 */
public class Accountant extends Worker {
    public Accountant(int wage) {
        this.wage = wage;
    }

    public void receiveBonus() {
        walletBalance = walletBalance + wage * 4;
    }

}
