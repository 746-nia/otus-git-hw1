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

     public String containsPhoneNumber (String phone) {
        String res ="-";
         for (Map.Entry<String, String> key : phoneBookMap.entrySet()) {
             if ((key.getKey()).equals(phone)) {
                 res = "Номер телефона есть в справочнике владелец " + key.getValue() ;
//                 System.out.println("Номер телефона есть в справочнике");
             } else {
                 res = "Номер телефона отсутсвует в справочнике";
             }
         }
         System.out.println(res);
         return res;
     }

}

