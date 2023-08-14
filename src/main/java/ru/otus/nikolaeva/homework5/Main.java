package ru.otus.nikolaeva.homework5;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Bars", 9, 25);
        Dog dog = new Dog("Max", 7, 15, 7);
        Horse horse = new Horse("Po", 35, 40, 20);

        cat.run(5);
        cat.swim(15);
        dog.run(25);
        dog.swim(35);
        horse.run(12);
        horse.swim(12);

        cat.info();
        dog.info();
        horse.info();
    }
}
