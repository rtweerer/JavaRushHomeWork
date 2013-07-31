package com.javarush.test.level05.lesson07.task04;

public class Circle
{
    int centerX;
    int centerY;
    int radius;
    int width;
    int color;

    public void initialize (int centerX, int centerY, int radius)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public void initialize (int centerX, int centerY, int radius, int width)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public void initialize (int centerX, int centerY, int radius, int width, int color)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }


}
