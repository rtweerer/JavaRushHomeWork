package com.javarush.test.level04.lesson13.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
           for (int i = 1; i <= 10; i++)
           {
               //вывести восьмерку сначала 1 раз, а в конце 10 раз;
               for (int j = 1; j <= i; j++) {
                   System.out.print("8");
               }
               System.out.println();
           }

    }
}
