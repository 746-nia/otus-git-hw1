package ru.otus.nikolaeva.homework4;

public class Cat {
    private String name;
    private String color;
    private int age;
    private float weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Cat(String name, String color, int age, float weight){
       this.name = name;
       this.age = age;
       this.weight = weight;
       this.color = color;
    }

    public void meow(){
        System.out.println(name + " мяукнул");
    }

    public void eat(){
        System.out.println(name + " покушал");
        weight += 0.01f;
    }

    public void jump(){
        System.out.println(name + " прыгнул");
    }

    public void info(){
        System.out.println(name + " " + color + " " +age + " " + weight);
    }


}
