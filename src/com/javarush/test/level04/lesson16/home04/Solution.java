package com.javarush.test.level04.lesson16.home04;
import java.util.Scanner;
/*
 Ввести с клавиатуры строку name.
 Ввести с клавиатуры дату рождения (три числа): y, m, d.
 Вывести на экран текст:
 «Меня зовут name
 Я родился d.m.y»
 Пример:
 Меня зовут Вася
 Я родился 15.2.1988
 */
public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int y, m, d = 0;
        y = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();

        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}
