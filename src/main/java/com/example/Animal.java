package com.example;

// Упражнение 1: Создание класса Animal
//Цель: Создать простой класс Animal и сделать коммит.
//Шаги: 1.
// В пакете com.example создайте класс Animal.java с простыми полями и методами
public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String makeSound() {
        return "Some animal sound";
    }
}
