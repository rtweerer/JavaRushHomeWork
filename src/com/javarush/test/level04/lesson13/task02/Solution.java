package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sM = reader.readLine();
        String sN = reader.readLine();
        int nM = Integer.parseInt(sM);
        int nN = Integer.parseInt(sN);

        for (int i = 1; i <= nM; i++) {
            for (int j = 1; j <= nN; j++)
            {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
