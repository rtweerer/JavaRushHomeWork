package com.javarush.test.level05.lesson07.task01;

public class Friend
{
    String name;
    int age;
    String sex;

    public void initialize(String name)
    {
          this.name = name;
    }
    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, String sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

}
