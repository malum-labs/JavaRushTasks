package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a <= 0 && b <= 0 && c <=0){
            System.out.println("0");
        }

        if (a > 0 && b <= 0 && c <= 0){
         System.out.println("1");
        }
        if (b > 0 && a <= 0 && c <= 0){
            System.out.println("1");
        }
        if (c > 0 && a <= 0 && b <= 0){
            System.out.println("1");
        }
        if (a > 0 && b > 0 && c <= 0){
            System.out.println("2");
        }
        if (a > 0 && c > 0 && b <= 0){
            System.out.println("2");
        }
        if (b > 0 && c > 0 && a <= 0){
            System.out.println("2");
        }
        if (a > 0 && b > 0 && c > 0){
            System.out.println("3");
        }




    }
}
