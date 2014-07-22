package com.mycompany.app;

/**
 * Created by grzegorzaperlinski on 22.07.2014.
 */
public class Calculator {
    private float total;
    public String name = "kalk";
    public Calculator(float total) {
        this.total = total;
    }
    public float getTotal() {
        return total;
    }
    public Calculator add(float value) {
        total = total + value;
        return this;
    }
    public Calculator subtract(float value) {
        total = total - value;
        return this;
    }
}
