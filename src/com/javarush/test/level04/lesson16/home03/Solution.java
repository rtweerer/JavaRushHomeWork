package com.javarush.test.level04.lesson16.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
 */
public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int nNumber = 0;
        int sum = 0;

        while ((nNumber = sc.nextInt()) != -1)
        {
            sum = sum + nNumber;
        }
        System.out.println(sum+nNumber);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int sum = 0;
//        int a = 0;
//
//        while((a = Integer.parseInt(br.readLine()))!= -1) {
//            sum = sum + a;
//        }
//                       System.out.println(sum+a);
//
}
}
