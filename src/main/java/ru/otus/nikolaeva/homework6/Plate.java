package ru.otus.nikolaeva.homework6;

public class Plate {
    private int maxFood;
    private int actualFood;

    public Plate(int maxFood, int actualFood) {
        this.maxFood = maxFood;
        this.actualFood = actualFood;
    }

    public int getMaxFood() {
        return maxFood;
    }

    public int getActualFood() {
        return actualFood;
    }

    public void addFood(int foodPart){
        if((foodPart + actualFood) > maxFood){
            System.out.println("Тарелка не может быть заполнена больше максимума. В тарелке стало еды = " + maxFood);
            actualFood = maxFood;
        } else {
            actualFood += foodPart;
            System.out.println("Добавлено " + foodPart + " еды. Тарелка полная.");
        }
    }

    public boolean reduceFood(int foodPart){
        if(actualFood - foodPart <= 0){
            System.out.println("Еды в тарелке меньше, чем хотите взять.");
            return false;
        }
        actualFood -=foodPart;
        System.out.println("Извлечено " + foodPart + " еды. В тарелке " + actualFood);
        return true;
    }
}
