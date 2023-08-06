package ru.otus.nikolaeva.homework4;

public class User {
    private String lastName;
    private String firstName;
    private String fatherName;
    private int year;
    private String email;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public User(String lastName, String firstName, String fatherName, int year, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.year = year;
        this.email = email;
    }

    public void info(){
        System.out.println("ФИО: " + lastName + " " + firstName + " " + fatherName);
        System.out.println("год рождения: " + year);
        System.out.println("email: " + email);
    }

}
