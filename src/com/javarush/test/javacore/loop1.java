package com.javarush.test.javacore;


import java.util.Arrays;

public class loop1
{
    public static void main(String[] args) {
        int[] data = {1, 4, 2};
        for (int barrier = data.length - 1; barrier >= 1; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (data[index] > data[index+1]) {
                    swap (data, index);//граничные условия!!    мы двигаем первый элемент
                }
                System.out.print(index);
            }
            System.out.println();
        }
        //говорящее имя - лучше комментария
        //самое большое окажется в конце всегда.
        //первый прогон, крупные элементы всплывают
        System.out.println(Arrays.toString(data));
        System.out.println(new Object());
    }

    private static void swap(int[] array, int k)
    {
        int tmp = array[k];
        array[k] = array[k+1];
        array[k+1] = tmp;
    }

    //маленькие методы с говорящим названием
    // 10 уровней абстракции, прыгать

    //именование переменных для компаний очень важно
    //форматирование кода - тоже важно
    //переменная целочисленные i,j,k - иногда
//    1. тип - не очень
//    2. роль переменной. User userSrc userDst
//    3.

    // в некрасивом коде тяжело искать ошибки

    //чем больше область видимости переменной, тем длинне должно быть имя
    // index - хорошее имя

    //допустимые аргументы. граничные условия
    //чтобы сортировал все, что не null
}
