package com.mycompany.app.other;

import com.mycompany.app.Calculator;

/**
 * Hello world!
 *
 */
public class App2
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculator calculator = new Calculator(2.2f);
        Calculator calculator2 = new Calculator(3f);
        calculator.add(5f);
        System.out.println(calculator.getTotal());
        calculator2.subtract(2f);
        System.out.println(calculator2.getTotal());

        calculator.add(5f).subtract(1f).add(2.5f);
        System.out.println(calculator.getTotal());

    }
}
