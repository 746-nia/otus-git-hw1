package ru.otus.nikolaeva.homework8;

public class AppArrayDataExeption extends  NumberFormatException{

 private String message;

    public AppArrayDataExeption(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
