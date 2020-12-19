package com.javarush.task.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine()); //считываем с клавиатуры вес
        double height = Double.parseDouble(bis.readLine()); //считываем с клавиатуры рост

        Body.calculateMassIndex(weight, height); //вызываем метод класса Body
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) { //метод
           double index = weight / (height * height); //формула расчета индекса
           
           if (index < 18.5){                                  //если индекс меньше 18.5
               System.out.println("Недовес: меньше чем 18.5"); //вывод на экран "недовес"
           }
           
           if (index > 18.5 && index < 25){       //если индекс больше 18.5 и меньше 25
               System.out.println("Нормальный: между 18.5 и 25"); //вывод на экран "нормальный"
           }
           
           if (index > 25 && index < 30){ //если индекс между 25 и 30
               System.out.println("Избыточный вес: между 25 и 30"); // вывод на экран "Избыточный"
           }
           
           if (index >= 30){ // если индекс больше 30
               System.out.println("Ожирение: 30 или больше"); //вывод на экран "ожирение"
           }
        }
    }
}


/*Контролируем массу тела
Программа должна считывать введенные пользователем вес в килограммах и рост в метрах и выводить на экран сообщение о индексе массы тела.
Реализуй статический метод класса Body. Метод должен определить индекс массы тела, и вывести на экран сообщение:
"Недовес: меньше чем 18.5" - если индекс массы тела меньше 18.5 (не включая),
"Нормальный: между 18.5 и 25" - если индекс массы тела между 18.5 и 25 (не включая),
"Избыточный вес: между 25 и 30" - если индекс массы тела между 25 и 30 (не включая),
"Ожирение: 30 или больше" - если индекс массы тела 30 или больше.

Подсказка:
Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)

Требования:
1. Метод calculateMassIndex должен выводить текст на экран.
2. Метод calculateMassIndex должен выводить "Недовес: меньше чем 18.5" на экран, если индекс массы тела меньше 18.5 (не включая).
3. Метод calculateMassIndex должен выводить "Нормальный: между 18.5 и 25" на экран, если индекс массы тела между 18.5 и 25 (не включая).
4. Метод calculateMassIndex должен выводить "Избыточный вес: между 25 и 30" на экран, если индекс массы тела между 25 и 30 (не включая).
5. Метод calculateMassIndex должен выводить "Ожирение: 30 или больше" на экран, если индекс массы тела 30 или больше.
 */
