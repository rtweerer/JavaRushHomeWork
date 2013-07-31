package com.javarush.test.javacore;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 29.07.13
 * Time: 18:56
 * To change this template use File | Settings | File Templates.
 */
public class Matrix_Mul
{

    public static int[][] mul(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                result[i][j] = 0;
                for (int N = 0; N < a.length; N++) {
                    result[i][j] += a[i][N] * b[N][j];
                }
            }
        }
        return result;
}

    public static void main(String[] args)
    {
        int[][] data = new int[2][2];
        int[][] data2 = new int[2][2];

        data[0][0] = 1;
        data[0][1] = 3;
        data[1][0] = 2;
        data[1][1] = 4;

        data2[0][0] = 0;
        data2[0][1] = 1;
        data2[1][0] = 5;
        data2[1][1] = 6;

        int[][] res = new int[2][2];
        res = mul(data,data2);

        for (int i = 0; i < res.length; i++)
        {
           for (int j = 0; j < res.length; j++) {
               System.out.print(res[i][j] + " ");
           }
            System.out.println();
        }
    }
}
