package com.javarush.test.level12.lesson09.task03;

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

    public abstract class Cat implements Run
    {
    }

    public abstract class Fish implements Swim
    {
    }

    public abstract class Bird implements Fly
    {
    }

    public abstract class Airplane implements Fly
    {
    }
}
