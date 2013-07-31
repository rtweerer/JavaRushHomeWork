package com.javarush.test.javacore;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 28.07.13
 * Time: 20:42
 * To change this template use File | Settings | File Templates.
 */
public class Merge_Q
{
    static int[] firstArray = { 1, 12, 24, 30} ;
    static int[] secondArray = { 1, 5, 15, 20} ;

    public static int[] merge(int[] first, int[] second)  {
        int[] result = new int[first.length + second.length];
        int firstIndex = 0;
        int secondIndex = 0;


        //шикарно заимплементил почти сам
        while (firstIndex + secondIndex != result.length) {
            if (firstIndex < first.length && secondIndex < second.length) {
                if (first[firstIndex] < second[secondIndex]) {
                    result[firstIndex + secondIndex] = first[firstIndex++];
                }
                else {
                    result[firstIndex + secondIndex] = second[secondIndex++];
                }
            }

            else if (secondIndex >= second.length) {
                //result[firstIndex+secondIndex] = first[firstIndex++];
                System.arraycopy(first, firstIndex, result, firstIndex+secondIndex, first.length - firstIndex); //NOT BAD
                break;
            }

            else if (firstIndex >= first.length) {
               // result[firstIndex+secondIndex] = second[secondIndex++];
                System.arraycopy(second, secondIndex, result, firstIndex+secondIndex, second.length - secondIndex);     //NOT BAD!!!!
                break;
            }


        }


        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(merge(firstArray, secondArray)));
    }
}
