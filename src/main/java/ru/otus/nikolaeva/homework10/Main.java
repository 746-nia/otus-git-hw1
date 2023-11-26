package ru.otus.nikolaeva.homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Phonebook phonebook = new Phonebook();
        phonebook.add("1234","Ivanov");
        phonebook.add("8956477","Petrov");
        phonebook.add("787897","Sidorov" );
        phonebook.add("1234888","Ivanov");
        phonebook.add("89128120457","Ivanov");
//        phonebook.find("Ivanov");
//        phonebook.find("Ivano");

        phonebook.containsPhoneNumber("8956477");
        phonebook.containsPhoneNumber("89564776");
//        phonebook.containsPhoneNumber("89128120457");



    }

}
