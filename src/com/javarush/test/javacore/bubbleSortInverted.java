package com.javarush.test.javacore;

import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 28.07.13
 * Time: 16:40
 * To change this template use File | Settings | File Templates.
 */
public class bubbleSortInverted
{
    public static void main(String[] args) {
        int[] data = {10, 20, 150, 40, 2};

        for (int barrier = 0; barrier < data.length-1; barrier++) {
            for (int index = data.length - 1; index > barrier; index--) {
                if (data[index] < data[index - 1]) {
                    swap (data, index);
                }
            }
        }

        System.out.println(Arrays.toString(data));

    }

    private static void swap(int[] data, int index)
    {
        int tmp = data[index];
        data[index] = data[index-1];
        data[index-1] = tmp;
    }


}
