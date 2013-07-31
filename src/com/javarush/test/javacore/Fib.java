package com.javarush.test.javacore;

/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 30.07.13
 * Time: 17:38
 * To change this template use File | Settings | File Templates.
 */
public class Fib
{
    public static void main(String[] args)
    {
        System.out.println(fib(25));
    }

    public static int fib(int arg) {
        return arg < 2 ? arg : fib(arg-2) + fib(arg - 1);
    }

}
