package com.javarush.test.level04.lesson06.task06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sName = reader.readLine();
        String sNumber4 = reader.readLine();
        int n1 = Integer.parseInt(sNumber4);

        if (n1 > 20) System.out.println("И 18-ти достаточно");
}
}
