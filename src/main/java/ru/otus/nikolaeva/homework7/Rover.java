package ru.otus.nikolaeva.homework7;

public class Rover extends AbstractTransport implements Transport{
    private float benzin;

    public Rover(float benzin) {
        this.benzin = benzin;
    }

    @Override
    public boolean move(int distance, TypeOfLocality locality) {
        float toplivoForDistance = 0.9f*distance;

        if(toplivoForDistance > benzin) {
            System.out.println("Бензина в вездеходе не хватит.");
            return false;
        }
        float actBenzin = benzin - toplivoForDistance;
        benzin = actBenzin;
        System.out.println("Переместились на вездеходе на расстояние " + distance + ". Бензина осталось " + actBenzin);
        return true;
    }
}
