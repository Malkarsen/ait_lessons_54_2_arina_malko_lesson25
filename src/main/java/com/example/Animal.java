package com.example;

// Упражнение 1: Создание класса Animal
//Цель: Создать простой класс Animal и сделать коммит.
// 1) В пакете com.example создайте класс Animal.java с простыми полями и методами
// 2) Создайте класс Main.java для проверки:
// 3) Запустите программу, убедитесь, что вывод корректный.
// 4) Создайте коммит с сообщением: “Add Animal class and Main runner”
// 5) Выполните Push, чтобы изменения появились на GitHub.
// Результат: У вас есть базовая программа и первый коммит с кодом класса Animal.

// Упражнение 2: Добавление нового функционала в Animal
// Цель: Научиться вносить изменения, коммитить и пушить их.
// 1) Добавьте в Animal новый метод, например, public void eat(String food),
// который выводит в консоль, что животное ест:
// 2) В Main вызовите этот метод: animal.eat("grass");
// 3) Запустите программу, убедитесь, что вывод соответствует ожиданиям.
// Создайте коммит с сообщением: “Add eat method to Animal and test it in Main”
// 4) Выполните Push на GitHub.
// Результат: Изменения опубликованы. Посмотрите историю коммитов на GitHub.

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

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }
}
