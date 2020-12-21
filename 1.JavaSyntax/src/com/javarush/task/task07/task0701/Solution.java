package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();  //вызываем метод initializeArray
        int max = max(array);             //вызываем метод max
        System.out.println(max);          // вывод на экран максимального числа
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //считывание с клавиатуры
        int[] array1 = new int[20];       //создаем новый массив в методе
        for(int i = 0; i < array1.length; i++){                //заполняем массив
            array1[i] = Integer.parseInt(reader.readLine());   //числами введенными с клавиатуры
        }
        return array1;        //возвращаем массив
    }

    public static int max(int[] array) {
        int max = array[0];                        //указываем максимальное значение
        for (int i = 0; i < array.length; i++){    //проходим все итерации массива
            if (array[i] > max)                    //если i больше максимального
            max = array[i];                        //присвиваем максимальному i
        }
        return max;                                //возвращаем максимальное число

    }
}

/*Массивный максимум
1. В методе initializeArray():
1.1. Создай массив на 20 чисел
1.2. Считай с консоли 20 чисел и заполни ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива


Требования:
1. Метод initializeArray должен создавать массив из 20 целых чисел.
2. Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
3. Метод max должен возвращать максимальный элемент из переданного массива.
4. Метод main изменять нельзя.

 */
