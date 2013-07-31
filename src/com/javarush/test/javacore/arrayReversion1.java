package com.javarush.test.javacore;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 28.07.13
 * Time: 17:40
 * To change this template use File | Settings | File Templates.
 */
public class arrayReversion1
{
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        System.arraycopy(data, 1, data, 2, 2); //(работает в 2 раза быстрее) начиная с позиции 1 скопировать в маиссв 2 2 элемента, начиная с позиции 2
        System.out.println(Arrays.toString(data));

    }

    private static void swap(int[] data, int first, int second)
    {
        int tmp = data[first];
        data[first] = data[second];
        data[second] = tmp;

    }





}
