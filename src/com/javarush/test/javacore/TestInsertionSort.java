package com.javarush.test.javacore;
import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 29.07.13
 * Time: 18:03
 * To change this template use File | Settings | File Templates.
 */
class TestInsertionSort {
    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " -> ");
            InsertionSort.insertionSort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}