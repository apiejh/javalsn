package com.mycompany.app.lesson4;

/**
 * Created by grzegorzaperlinski on 19.08.2014.
 */
public class Finance {
    public void payDailyWage(Worker worker) {
        worker.receivePayment(8);
    }

    public void giveBonus(Accountant accountant) {
        accountant.receiveBonus();
    }
}
