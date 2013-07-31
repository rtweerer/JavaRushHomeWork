package com.javarush.test.javacore;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 28.07.13
 * Time: 18:16
 * To change this template use File | Settings | File Templates.
 */

public class arrayReversionReversed
{
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        for (int index = data.length/2 - 1; index >= 0; index--) {
            swap(data, index, data.length - 1 - index);
        }
        System.out.println(Arrays.toString(data));
         // ассемлебрная инструкция: гипотеза, что может работать быстрее, если сравнить с нулем
    }

    private static void swap(int[] data, int first, int second)
    {
        int tmp = data[first];
        data[first] = data[second];
        data[second] = tmp;

    }





}
