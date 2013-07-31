package com.javarush.test.level10.lesson11.home06;

/*
 Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
 */
public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        int age;
        String address;
        int height;
        int weight;
        String sex;

        Human() {

        }
        Human(String name) {
            this.name = name;
        }

        Human (String name, int age) {
            this.name = name;
            this.age = age;
        }

        Human (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        Human (String name, int age, String address, int height) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.height = height;
        }

        Human (String name, int age, String address, int height, int weight) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.height = height;
            this.weight = weight;
        }

        Human (String name, int age, String address, int height, int weight, String sex) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
        }

        Human (String name, String sex) {
            this.name = name;
            this.sex = sex;
        }

        Human (int age, String address) {
            this.age = age;
            this.address = address;
        }

        Human (int age, int height) {
            this.age = age;
            this.height = height;
        }



    }
}
