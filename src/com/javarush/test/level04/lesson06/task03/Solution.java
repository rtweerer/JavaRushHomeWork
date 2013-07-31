package com.javarush.test.level04.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();
        String sNumber3 = reader.readLine();
        int n1 = Integer.parseInt(sNumber1);
        int n2 = Integer.parseInt(sNumber2);
        int n3 = Integer.parseInt(sNumber3);

        int max;
        if (n1 > n2)
            max = n1;
        else max = n2;
        if (n3 > max)
            max = n3;
        if (n1 == max) {
        System.out.println(n1 + " " + max(n2,n3) + " " + min (n2, n3));
        }
        else if (n2 == max) {
        System.out.println(n2 + " " + max (n1,n3) + " " + min(n1,n3));
         }
        else
        {
            System.out.println(n3 + " " + max(n1,n2) + " " + min(n1,n2));
        }



    }

    public static int max (int a, int b) {
        if (a > b)
            return a;
        else return b;
    }
    public static int min (int a, int b) {
        if (a < b)
            return a;
        else return b;
    }
}
