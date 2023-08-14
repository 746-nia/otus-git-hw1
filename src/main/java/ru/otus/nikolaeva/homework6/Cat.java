package ru.otus.nikolaeva.homework6;

public class Cat {
    private String name;
    private int capacity;
    private boolean befull;

    public Cat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.befull = false;
    }

    public void eat(Plate plate){
        int foodInPlate = plate.getActualFood();
        if(foodInPlate >= capacity){
            plate.reduceFood(capacity);
            System.out.println("Кот поел и наелся.");
            befull = true;
        } else {
            System.out.println("Кот не поел. Нужно добавить хотя бы " + (capacity - foodInPlate) + " еды");
        }
    }

    public void info(){
        System.out.println("Информация о коте: " + name  + ", сытость " + befull);
    }
}
