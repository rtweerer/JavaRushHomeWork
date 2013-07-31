package com.javarush.test.level12.lesson06.task05;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static abstract class Pet
    {
        public abstract String getName();
        public abstract Pet getChild();
    }

    public static class Cat extends Pet
    {
        @Override
        public String getName()
        {
            return "cat";
        }

        @Override
        public Pet getChild()
        {
            return new Cat();
        }
    }

    public static class Dog extends Pet
    {
        @Override
        public String getName()
        {
            return ("dog");
        }

        @Override
        public Pet getChild()
        {
            return new Dog();
        }
    }



}
