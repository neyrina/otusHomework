package com.kukunina.dz1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.kukunina.dz1.Commands.ADD;
import static com.kukunina.dz1.Commands.LIST;
import static com.kukunina.dz1.Commands.EXIT;

public class Running {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        String command = "";
        List<String> Animals = new ArrayList<>();

        while (!command.equals("exit")) {
            System.out.println("Меню");
            System.out.println("Введите add для выбора животного и ввода его параметров");
            System.out.println("Введите list для вывода всех элементов массива");
            System.out.println("Введите exit для выхода");
            command = menu.next();
            switch (command.trim().toLowerCase()) {
                case "add":
                    Scanner inpType = new Scanner(System.in);
                    System.out.println("Введите вид животного (cat/dog/duck) ");
                    String type = inpType.next().trim().toLowerCase();
                    switch (type) {
                        case "cat":
                            input();
                            Animal cat = new Cat(Animal.name, Animal.age, Animal.weight, Animal.color);
                            Animals.add(cat.toString());
                            cat.say();
                            break;
                        case "dog":
                            input();
                            Animal dog = new Dog(Animal.name, Animal.age, Animal.weight, Animal.color);
                            Animals.add(dog.toString());
                            dog.say();
                            break;
                        case "duck":
                            input();
                            Animal duck = new Duck(Animal.name, Animal.age, Animal.weight, Animal.color);
                            Animals.add(duck.toString());
                            duck.say();
                            break;
                        default:
                            System.out.println("Введено некорректное значение, введите заново");
                    }
                    break;
                case "list":
                    for(int i=0;i <Animals.size(); i++) {
                        System.out.println(Animals.get(i));
                    }
                    System.out.println(" ");
                    break;
                case "exit":
                    System.out.println("Выход из меню");
                    break;
                default:
                    System.out.println("Введено некорректное значение, введите заново");
            }
        }
    }
    private static void input (){
        Scanner inpName = new Scanner(System.in);
        Scanner inpAge = new Scanner(System.in);
        Scanner inpWeight = new Scanner(System.in);
        Scanner inpColor = new Scanner(System.in);
        System.out.println("Введите имя животного");
        Animal.name = inpName.next();
        System.out.println("Введите возраст животного");
        Animal.age = inpAge.next();
        System.out.println("Введите вес животного");
        Animal.weight = inpWeight.next();
        System.out.println("Введите цвет животного");
        Animal.color = inpColor.next();
    }
}
