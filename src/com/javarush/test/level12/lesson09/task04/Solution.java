package com.javarush.test.level12.lesson09.task04;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public interface Fly
    {
        public void fly();
    }

    public interface Run
    {
        public void run();
    }

    public interface Swim
    {
        public void swim();
    }


    public abstract class Human implements Run, Swim
    {

    }

    public abstract class Duck implements Swim, Run, Fly
    {

    }

    public abstract class Penguin implements Run, Swim
    {

    }

    public abstract class Airplane implements Fly
    {

    }
}
