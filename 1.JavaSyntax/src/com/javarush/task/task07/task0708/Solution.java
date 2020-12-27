package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


Требования:
1. В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/

public class Solution {
    private static ArrayList<String> strings; //объявлен массив

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>();  //1. Создай список строк.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i < 5; i++){
        String s = reader.readLine();
        strings.add(s); //2. Считай с клавиатуры 5 строк и добавь в список.
        }
     int m = strings.get(0).length();
        for(String s : strings) {
            if (s.length() > m) {
                m = s.length();    //3. Используя цикл, найди самую длинную строку в списке.
            }
        }

                for(String s : strings){
                    if(s.length() == m){
                        System.out.println(s);
    //  4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
                    }

      }
    }
}