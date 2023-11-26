package ru.otus.nikolaeva.homework7;

public class Horse extends AbstractTransport implements Transport{
    private int endurance;

    public Horse(int endurance) {
        this.endurance = endurance;
    }

    @Override
    public boolean move(int distance, TypeOfLocality locality) {
        int enduranceForDistance = 4*distance;

        if((locality.equals(TypeOfLocality.SWAMP))){
            System.out.println("Лошадь по данной местности " + locality + " не едет.");
            return false;
        }
        if(enduranceForDistance > endurance) {
            System.out.println("Лошади не хватает выносливости");
            return false;
        }
        int actEndurance = endurance - enduranceForDistance;
        endurance = actEndurance;
        System.out.println("Переместились на лошади на расстояние " + distance + ". Выносливости осталось " + actEndurance);
        return true;
    }
}
