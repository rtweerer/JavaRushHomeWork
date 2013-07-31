package com.javarush.test.level04.lesson06.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sName = reader.readLine();
        String sName2 = reader.readLine();



        if (!sName.equals(sName2))
        {
            if (sName.length() == sName2.length())
         {
        System.out.println("Длины имен равны");
        }
        }

        else if (sName.equals(sName2))
        {
            System.out.println("Имена идентичны");
        }

    }
}
