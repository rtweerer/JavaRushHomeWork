package com.javarush.test.level04.lesson16.home02;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
 */
public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();
        String sNumber3 = reader.readLine();

        int n1 = Integer.parseInt(sNumber1);
        int n2 = Integer.parseInt(sNumber2);
        int n3 = Integer.parseInt(sNumber3);

        if (!(isMax(n1,n2,n3)) && !(isMin(n1,n2,n3)))
        {
            System.out.println(n1);
        }
        else if (!(isMax(n2,n1,n3)) && !(isMin(n2,n1,n3))) {
        System.out.println(n2);
    }
        else System.out.println(n3);
    }

    public static Boolean isMax (int a, int b, int c)
    {
        return (a > b && a > c);
    }
    public static Boolean isMin(int a, int b, int c)
    {
        return (a < b && a < c);
    }
}
