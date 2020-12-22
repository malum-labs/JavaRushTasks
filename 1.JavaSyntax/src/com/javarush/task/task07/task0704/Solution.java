package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[10];               //создание массива из 10 чисел
        for (int i = 0; i < number.length; i++) { //цикл записи в массив
            number[i] = Integer.parseInt(reader.readLine());  //запись в массив данных с клавиатуры
        }

        for (int i = 9; i >= 0; i--){  //цикл прокрутки массива в обратном порядке
            System.out.println(number[i]);  //вывод на экран массива в обратном порядке
        }
    }
}
/*Переверни массив
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.


Требования:
1. Программа должна создавать массив на 10 целых чисел.
2. Программа должна считывать числа для массива с клавиатуры.
3. Программа должна выводить 10 строчек, каждую с новой строки.
4. Массив должен быть выведен на экран в обратном порядке.

 */
