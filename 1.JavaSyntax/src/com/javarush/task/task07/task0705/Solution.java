package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public Solution() {
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] bigArray = new int[20];   //создание массива из 20 чисел
    for(int i = 0; i < 20; i++){    //цикл записи массива
        bigArray[i] = Integer.parseInt(reader.readLine());   //запись в массив чисел с клавиатуры
    }
    int[] array1  = new int[10];    //создание первого массива из 10 чисел
    System.arraycopy(bigArray, 0, array1, 0, array1.length); /*запись первых десяти чисел из большого
                                                                              массива в первый массив*/

    int[] array2 = new int[10];     //создание второго массива из 10 чисел
    System.arraycopy(bigArray, array1.length, array2, 0, array2.length); /*запись вторых десяти чисел
                                                                                   из большого массива во второй массив*/

    for(int i = 0; i < array2.length; i++)     //цикл вывода на экран второго массива
    System.out.println(array2[i]);             //вывод на экран второго массива

    }
}
/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.


Требования:
1. Программа должна создавать большой массив на 20 целых чисел.
2. Программа должна считывать с клавиатуры 20 чисел для большого массива.
3. Программа должна создавать два маленьких массива на 10 чисел каждый.
4. Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести второй маленький массив на экран.

 */