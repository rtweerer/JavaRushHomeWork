package com.javarush.test.level12.lesson09.task05;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public interface Run
    {
        public void run();
    }

    public interface Swim
    {
        public void swim();
    }

    public abstract class Human  implements Run, Swim
    {

    }
}
