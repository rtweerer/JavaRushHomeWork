package com.javarush.test.level12.lesson02.task01;

public class Solution
{
    public static void main(String[] args)
    {
        Whale cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow
    {
        public String getName()
        {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow
    {
        public String getName() {
            return "Я не коров, Я - кит.";
        }
    }
}
