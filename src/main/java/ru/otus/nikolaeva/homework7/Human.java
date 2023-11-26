package ru.otus.nikolaeva.homework7;

public class Human {
    String name;
    private int enduranceHuman;
    private Transport currenttransport;

    public Human(String name, int enduranceHuman) {
        this.name = name;
        this.enduranceHuman = enduranceHuman;
    }

    public int getEnduranceHuman() {
        return enduranceHuman;
    }

    public void setEnduranceHuman(int enduranceHuman) {
        this.enduranceHuman = enduranceHuman;
    }

    public Transport getCurrenttransport() {
        return currenttransport;
    }

    public void setCurrenttransport(AbstractTransport currenttransport) {
        if(currenttransport == null) {
            System.out.println("Транспорт не выборан");
        } else {System.out.println(name + " находится в транспорте " + currenttransport.getClass().getSimpleName());
            currenttransport.setDriver(this);
        }
        this.currenttransport = currenttransport;
    }

    public void move(int distance, TypeOfLocality locality) {
        if(currenttransport != null){
            currenttransport.move(distance, locality);
        } else System.out.println("Прошел пешком расстояние " + distance);
    }
}
