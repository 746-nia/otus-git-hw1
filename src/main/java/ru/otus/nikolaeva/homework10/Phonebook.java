package ru.otus.nikolaeva.homework10;

import java.util.*;

public class Phonebook {

    Map<String, String> phoneBookMap = new TreeMap<>();


    public void add(String phone, String name) {
            phoneBookMap.put(phone, name);
    }


    public Set<String> find (String name) {
        Set<String> listPhone = new TreeSet<>();
        for (Map.Entry<String, String> key : phoneBookMap.entrySet()) {
            if (key.getValue().equals(name)) {
               listPhone.add(key.getKey());
                System.out.println("Найден телефон " + listPhone + " - " + name );
            } else {System.out.println("Номера нет в справочнике");}
        }
        return listPhone;
    }

     public boolean containsPhoneNumber (String phone) {
        boolean hasKey = phoneBookMap.containsKey(phone);
         System.out.println(hasKey);
         return hasKey;
     }

}

