package com.javarush.test.javacore;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 29.07.13
 * Time: 0:56
 * To change this template use File | Settings | File Templates.
 */
public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] data = {1, 5, 55, 10, 15, 12};
        insertionSort(data);
        System.out.println(binarySearch(data, 0, 4, 10));
        System.out.println(Arrays.toString(data));

    }


    public static int[] insertionSort(int[] arr) {
        for (int barrier = 1; barrier < arr.length; barrier++) {
            int newElement = arr[barrier];

//            while (barrier >= 0 && newElement < arr[location]) {
//                arr[location+1] = arr[location];           //ищем место для newElement, пока он меньше текущего места, то просто копируем текущий в следующий, освобождая место и двигаемся дальше
//                                                             //когда нашли место за барьером, копируем наш барьерный элемент туда. это после выхода из цикла
//                location--;
//            }

            int index = binarySearch(arr, 0, barrier-1, newElement);  //бинарный поиск только по отсортированному массиву
//            for (int k = barrier; k > index; k--)
//            {
//                arr[k] = arr[k-1];     //сдвигаем вправо
//
//            }
          System.arraycopy(arr, index, arr, index+1, barrier - index);
            arr[index] = newElement;
        }
        return arr;
    }

    public static int binarySearch(int[] arr, int low,int high,int key){
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(key>arr[mid])
                low=mid+1;
            else if(key<arr[mid])
                high=mid-1;
            else
                return mid;
        }
        return low;
    }
}
