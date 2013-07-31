package com.javarush.test.level05.lesson05.task01;

public class Cat
{
    String name;
    int age;
    int weight;
    int strength;


    public Boolean fight(Cat anotherCat)
    {
        if (this.age > anotherCat.age)
            return true;
        else if (this.weight > anotherCat.weight && this.strength > anotherCat.strength)
            return true;
        else
            return false;
    }
}
