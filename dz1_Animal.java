package com.kukunina.dz1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Animal {
    public static String name;
    public static String age;
    public static String weight;
    public static String color;
    public static String pet;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say() {
        System.out.println("Я говорю ");
    }

    public void go() {
        System.out.println("Я иду ");
    }

    public void drink() {
        System.out.println("Я пью ");
    }

    public void eat() {
        System.out.println("Я ем ");
    }

    @Override
    public String toString() {

        if (age.equals("1")) {
            pet = "Привет! Меня зовут " + name + ", мне " + age + " год" + ", я вешу " + weight + " кг, мой цвет - " + color;
        } else if (age.endsWith("2") || age.endsWith("3") || age.endsWith("4")) {
            pet = "Привет! Меня зовут " + name + ", мне " + age + " года" + ", я вешу " + weight + " кг, мой цвет - " + color;
        } else {
            pet = "Привет! Меня зовут " + name + ", мне " + age + " лет" + ", я вешу " + weight + " кг, мой цвет - " + color;
        }
        return pet;
    }


}
