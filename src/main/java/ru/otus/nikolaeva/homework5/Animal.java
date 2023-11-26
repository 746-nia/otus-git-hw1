package ru.otus.nikolaeva.homework5;

public abstract class Animal {
    String name;
    float speedRun;
    float endurance;

    public Animal(String name, float speedRun, float endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.endurance = endurance;
    }

    public String getName() {
        return name;
    }

    public float getSpeedRun() {
        return speedRun;
    }

    public float getEndurance() {
        return endurance;
    }

    public int run(int distance) {
        float time = distance/speedRun;
        if((endurance - distance) <= 0){
            System.out.println(name + " не хватает выносливости");
            return -1;
        }
        endurance -= distance;
        return  (int)time;
    }

    public abstract int swim(int distance);

    public void info(){
        System.out.println("Название: " + name + ", выносливость: "+ endurance);
    }
}
