package ru.otus.nikolaeva.homework5;

public class Horse extends Animal{
    float swimSpeed;
    public Horse(String name, float speedRun, float endurance, float swimSpeed) {
        super(name, speedRun, endurance);
        this.swimSpeed = swimSpeed;
    }

    public float getSwimSpeed() {
        return swimSpeed;
    }

    @Override
    public int swim(int distance) {
        float time = distance/swimSpeed;
        if((endurance - 4*distance) <= 0){
            System.out.println(this.name + " не хватает выносливости");
            return -1;
        }
        endurance -= 4*distance;
        return (int) time;
    }
}
