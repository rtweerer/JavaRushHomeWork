package com.javarush.test.level04.lesson06.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();
        int n1 = Integer.parseInt(sNumber1);
        int n2 = Integer.parseInt(sNumber2);

        if (n1 > n2)
        {
            System.out.println(n2);
        }
        else
        {
            System.out.println(n1);
        }

    }
}