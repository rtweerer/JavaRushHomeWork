package com.javarush.test.level12.lesson04.task02;

public class Solution
{
    public static void main(String[] args)
    {
        print(5);
        Integer num = new Integer(5);
        print(num);
    }

    public static void print (Integer number) {
        System.out.println(number);
    }

    public static void print (int number) {
        System.out.println(number);
    }
}
