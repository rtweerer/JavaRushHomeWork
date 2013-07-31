package com.javarush.test.level04.lesson10.task05;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int j = 1;
        while (j <= 10) {
            int i = 1;
            while (i <= 10)
            {
                System.out.print(i*j);
                System.out.print(" ");
                i++;
            }
            System.out.println();
            j++;
        }
       }
}
