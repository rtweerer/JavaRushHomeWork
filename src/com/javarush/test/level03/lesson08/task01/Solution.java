package com.javarush.test.level03.lesson08.task01;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sValue = reader.readLine();
        int nValue = Integer.parseInt(sValue);
        String s1 = reader.readLine();
        System.out.println(s1 + " захватит мир через " + nValue + " лет. " + "Му-ха-ха!");

    }
}