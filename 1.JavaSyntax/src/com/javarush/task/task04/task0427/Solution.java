package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int length = String.valueOf(a).length();

        if (a >= 1 && a <= 999 && (a%2) == 0 && length == 1  ){
            System.out.println("четное однозначное число");
        }
        else if (a >= 1 && a <= 999 && (a%1) == 0 && length == 1){
            System.out.println("нечетное однозначное число");
        }
        else if (a >= 1 && a <= 999 && (a%2) == 0 && length == 2){
            System.out.println("четное двузначное число");
            }
        else if (a >= 1 && a <= 999 && (a%1) == 0 && length == 2){
            System.out.println("нечетное двузначное число");
        }
        else if (a >= 1 && a <= 999 && (a%2) == 0 && length == 3){
            System.out.println("четное трехзначное число");
        }
        else if (a >= 1 && a <= 999 && (a%1) == 0 && length == 3){
            System.out.println("нечетное трехзначное число");
        }



    }
}
