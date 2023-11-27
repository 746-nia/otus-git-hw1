package ru.otus.nikolaeva.homework8;

public class Main {
    public static void main(String[] args) {
        try{
            arrayCheckSize(new String[][] {{"fdf", "5", "4", "5", "5"},{"4", "5", "4", "5"},{"4", "5", "4", "5"},{"4", "5", "4", "5"}});
        }catch (AppArraySizeExeption ex){
            System.out.println(ex.getMessage());
        }
        catch (AppArrayDataExeption ex){
            System.out.println(ex.getMessage());
        }
    }
    public static  int arrayCheckSize(String[][] arr) throws AppArraySizeExeption, AppArrayDataExeption{
       int sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if(arr[i].length != 4 || arr[j].length != 4){
                    throw new AppArraySizeExeption("Размер массива не соответствует " + arr.length);
                }
                try{
                    sum +=Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    throw new AppArrayDataExeption("Некоректный формат преобразования " + i + " : "+ j);
                }
            }
        }
        System.out.println("Сумма элементов массива " + sum);
        return sum;
    }
}
