package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/*
 Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
 Пример вывода:
 а 5
 б 8
 в 3
 г 7
 …
 я 9
 */
public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] charCount = new int[33];
        //алфавит
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(int i=0;i<32;i++)
        {
            alphabet.add( (char) ('а'+i));
        }
        alphabet.add(6,'ё');

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<10;i++)
        {
            String s = reader.readLine();
            list.add( s.toLowerCase());
        }


        TreeMap<Character, Integer> map = new TreeMap<>();

//        for (String s : list) {
//            char[] array = s.toCharArray();
//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < alphabet.size(); j++) {
//                    if (array[i] == alphabet.get(j) && map.containsKey(alphabet.get(j))) {
//                        map.put(alphabet.get(j), map.get(alphabet.get(j)) + 1);
//                    }
//                    else if (array[i] == alphabet.get(j) && !map.containsKey(alphabet.get(j))) {
//                        map.put(alphabet.get(j), 1);
//                    }
//
//                    else if (array[i] != alphabet.get(j) && map.containsKey(alphabet.get(j))) {
//                        continue;
//                    }
//                    else  {
//                        map.put(alphabet.get(j), 0);
//                    }
//
//                }
//            }
//        }

        for (int i = 0; i < list.size();i++) {
            char[] nextString = list.get(i).toCharArray();
            for (int j = 0; j < nextString.length; j++) {
                int index = alphabet.indexOf(nextString[j]);  //умно. просто для каждого символа в каждой строке, получаем его индекс в алфавите и увеличиваем количество по соответствующему индексу в массиве.
                charCount[index]++;
            }
        }

        for (int i = 0; i < charCount.length; i++) {
            System.out.println(alphabet.get(i) + " " + charCount[i]);
        }

//        for (Map.Entry<Character, Integer> pair : map.entrySet())
//        {
//            System.out.println(pair.getKey() + " " + pair.getValue());
//        }


    }

}
