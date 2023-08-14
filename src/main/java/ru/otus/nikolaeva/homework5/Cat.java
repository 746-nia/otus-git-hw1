package ru.otus.nikolaeva.homework5;

public class Cat extends Animal {

    public Cat(String name, float speedRun, float endurance) {
        super(name, speedRun, endurance);
    }

    @Override
    public int swim(int distance) {
        System.out.println("У " + name + " нет такого функционала");
        return distance;
    }
}
