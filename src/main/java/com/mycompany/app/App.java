package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        Calculator calculator = new Calculator(2.2f);
//        Calculator calculator2 = new Calculator(3f);
//        calculator.name = "calc";
//        //System.out.println(Calculator.name);
//        calculator.add(5f);
//        System.out.println(calculator2.name);
//        System.out.println(calculator.getTotal());
//        calculator2.subtract(2f);
//        System.out.println(calculator2.getTotal());
//
//        calculator.add(5f).subtract(1f).add(2.5f);
//        System.out.println(calculator.getTotal());

        for (int i = 0; i < 10; i++) {
            calculator.add(i);
            System.out.println(calculator.getTotal());
        }
    }
}
