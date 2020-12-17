package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(r.readLine());
       int summa = 0;


          while (number != -1){

              summa += number;
              number = Integer.parseInt(r.readLine());



      }
        System.out.println(summa - 1);



       }
     


       }
      
      
      
    

