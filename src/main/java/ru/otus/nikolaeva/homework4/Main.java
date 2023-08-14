package ru.otus.nikolaeva.homework4;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User("nikolaeva", "irina", "alekseevna", 1997, "irnika@.ru"),
                new User("legost", "anna", "-", 1980, "123@.ru"),
                new User("ivanova", "elena", "artemovna", 1965, "elena456@.ru"),
                new User("sharf", "anastasia", "sergeevna", 1990, "anastSh@.ru"),
                new User("sidorova", "daria", "andreevna", 2000, "sid97DA@.ru"),
                new User("nikolaeva", "maria", "alekseevna", 2003, "marNikol999@.ru")
        };


        for (int i = 0; i < users.length; i++) {
            int difference = 2023 - users[i].getYear();
            if (difference >= 40){
                users[i].info();
            }

        }

        Box box = new Box(10.0f, 5f, 3f, "pink");
        box.setColor("white");
        box.info();
        box.close();
        box.open();
        String obj = "pen";
        box.interactObj(obj);
        String objN = "pensil";
        box.interactObj(objN);

    }
}
