package com.javarush.test.level05.lesson07.task05;

public class Rectangle
{
    int top;
    int left;
    int width;
    int height;


    public void initialize (int left, int height, int top, int width)
    {
        this.top = top;
        this.height = height;
        this.width = width;
        this.left = left;
    }

    public void initialize (int left, int top)
    {
        this.top = top;
        this.left = left;
    }

    public void initialize (int top, int height, int width)
    {
        this.top = top;
        this.height = height;
        this.width = width;
    }


}
