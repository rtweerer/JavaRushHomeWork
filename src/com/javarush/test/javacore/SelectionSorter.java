package com.javarush.test.javacore;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 28.07.13
 * Time: 21:22
 * To change this template use File | Settings | File Templates.
 */
public class SelectionSorter
{


    public static void main(String[] args)
    {
        int[] data = {10, 412, 2, 4, 543};
        selectionSort(data);
        System.out.println(Arrays.toString(data));


    }

    public static void selectionSort (int[] array) {
        for (int barrier = 0; barrier < array.length - 1; barrier++) {
            int elem = array[barrier];   //обращению к элементу масива медленнее, чем к локальной перменной. не нужно делать проверок на границы массива
            int aIndex = barrier+1;
            int min = array[barrier+1]; //сначала считаем, что минимальный - первый. потом ищем какой на самом деле минимальный и узнаем его индекс
            for (int index = barrier + 2; index < array.length; index++) {
                if (array[index] < min  ) {
                    min = array[index];
                    aIndex = index;
                }

            }
            if (elem > array[aIndex]) {    //хорошо придумал. шикарно
                int tmp = array[aIndex];
                array[aIndex] = array[barrier];
                array[barrier] = tmp;
            }
        }
    }

    //ускорить в 2 раза - фигня, ускорить в 1000 раз - в реально программировании (бизнесс)
     // 100 раз в секунду - события
    //J2EE - очень много сделал. через веб-сервис. 100 000 строк кода. Они их не написал
    // в джаве не тюнят битики в реальности. миллионы строк чужого кода
}

