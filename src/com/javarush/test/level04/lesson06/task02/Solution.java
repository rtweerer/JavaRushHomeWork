package com.javarush.test.level04.lesson06.task02;

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
        String sNumber4 = reader.readLine();
        int n1 = Integer.parseInt(sNumber1);
        int n2 = Integer.parseInt(sNumber2);
        int n3 = Integer.parseInt(sNumber3);
        int n4 = Integer.parseInt(sNumber4);
        int m;
        if (n1 < n2)
            m = n2;
        else m = n1;

        if (m < n3)
            m = n3;
        if (m < n4)
            m = n4;
        System.out.println(m);
    }
}


