package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
   String name = null;
   int age = 2;
   int weight = 5;
   String color = "black";
   String address;
   
   public void initialize (String name){
       this.name = name;
       this.age = age;
       this.weight = weight;
       this.color = color;
   }
    public  void initialize (String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize (String name, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize (int weight, String color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize (int weight, String color, String address){
        this.address = address;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
}
