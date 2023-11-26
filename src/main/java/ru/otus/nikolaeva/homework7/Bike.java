package ru.otus.nikolaeva.homework7;

public class Bike extends AbstractTransport implements Transport{
    @Override
    public boolean move(int distance, TypeOfLocality locality){
        int enduranceForDistance = 2*distance;
        int endurance = getDriver().getEnduranceHuman();
        if((locality.equals(TypeOfLocality.SWAMP))){
            System.out.println("Велосипед по данной местности " + locality + " не едет.");
        return false;
        }
        if(enduranceForDistance > endurance) {
            System.out.println("Человеку не хватает выносливости");
            return false;
        }
        int actEndurance = endurance - enduranceForDistance;
        getDriver().setEnduranceHuman(actEndurance);
        System.out.println("Переместились на велосипеде на расстояние " + distance + ". Выносливости у человека осталось " + actEndurance);
        return true;
    }
}
