package ru.otus.nikolaeva.homework8;

public class AppArraySizeExeption extends Exception{
    private String message;

    public AppArraySizeExeption(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
