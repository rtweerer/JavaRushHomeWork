package com.javarush.test.level03.lesson12.home03;
/*
 Ввести с клавиатуры число n.
 Вывести на экран надпись «Я буду зарабатывать $n в час».
 Пример:
 Я буду зарабатывать $50 в час
 */
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
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


        System.out.println("Я буду зарабатывать $" + n1 + n2 + " в час");
    }
}