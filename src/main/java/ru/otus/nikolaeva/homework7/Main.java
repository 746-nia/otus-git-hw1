package ru.otus.nikolaeva.homework7;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(100);
        Bike bike = new Bike();
        Horse horse = new Horse(120);
        Rover rover = new Rover(95);
        Human human = new Human("ted", 100);
        human.setCurrenttransport(car);
        human.move(10, TypeOfLocality.FOREST);
        human.setCurrenttransport(null);
        human.move(10, TypeOfLocality.FOREST);
        human.setCurrenttransport(car);
        human.move(10, TypeOfLocality.PLAIN);
        human.move(5, TypeOfLocality.PLAIN);
        human.setCurrenttransport(bike);
        human.move(15, TypeOfLocality.PLAIN);
        human.setCurrenttransport(horse);
        human.move(15, TypeOfLocality.SWAMP);
        human.move(15, TypeOfLocality.FOREST);
        human.move(150, TypeOfLocality.FOREST);
        human.setCurrenttransport(rover);
        human.move(15, TypeOfLocality.SWAMP);
        human.move(33, TypeOfLocality.FOREST);
        human.move(150, TypeOfLocality.PLAIN);
    }


}
