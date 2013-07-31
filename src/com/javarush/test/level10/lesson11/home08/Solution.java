package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/*
 Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести на их экран.
 */
public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList[] strListArray = new ArrayList[10];
        for (int i = 0; i < 10; i++)
        {
            strListArray[i] = new ArrayList<String>(  );
            for ( int j = 0; j < 10; j++ )
            {
                strListArray[i].add( i + " - " + j );
            }
        }

        return strListArray;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}