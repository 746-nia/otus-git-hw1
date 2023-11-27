package ru.otus.nikolaeva.homework7;

public class Car extends AbstractTransport implements Transport{

    private float benzin;

    public Car(float benzin) {
        this.benzin = benzin;
    }

    @Override
    public boolean move(int distance, TypeOfLocality locality) {
        float toplivoForDistance = 0.7f*distance;

        if((locality.equals(TypeOfLocality.FOREST)) ||(locality.equals(TypeOfLocality.SWAMP)) ){
            System.out.println("Машина по данной местности " + locality + " не едет.");
            return false;
        }
        if(toplivoForDistance > benzin) {
            System.out.println("Бензина в машине не хватит.");
            return false;
        }
        float actBenzin = benzin - toplivoForDistance;
        benzin = actBenzin;
        System.out.println("Переместились на машине на расстояние " + distance + ". Бензина осталось " + actBenzin);
        return true;
    }
}
