package ru.otus.nikolaeva.homework6;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100, 50);
        plate.addFood(60);
        plate.addFood(50);
        plate.reduceFood(110);
        plate.reduceFood(75);

        Cat cat = new Cat("Bars", 9);
        Cat cat2 = new Cat("Barsik", 9);
        Cat cat3 = new Cat("Bam", 10);
        cat.eat(plate);
        cat.info();
        cat2.eat(plate);
        cat2.info();
        cat3.eat(plate);
        cat3.info();
    }
}
