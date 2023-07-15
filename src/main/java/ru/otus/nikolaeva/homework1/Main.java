package ru.otus.nikolaeva.homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        greetings();
        checkSign(1, 2, 0);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(5, 4, false);
        hardTask();
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int res = a + b + c;
        if (res > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = (int) Math.random();
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20 && data >= 10) {
            System.out.println("Желтый");
        } else
            System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a = (int) Math.random();
        int b = (int) Math.random();
        if (a >= b) {
            System.out.println("a >= b");
        } else
            System.out.println("a < b");
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            int res = initValue + delta;
            System.out.println(res);
        } else System.out.println(initValue - delta);
    }

    public static void hardTask() {
        System.out.println("Введите число от 1 до 5");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            greetings();
        } else if (n == 2) {
            int a = (int) Math.random();
            int b = (int) Math.random();
            int c = (int) Math.random();
            checkSign(a, b, c);
        } else if (n == 3) {
            selectColor();
        } else if (n == 4) {
            compareNumbers();
        } else {
            int initValue = (int) Math.random();
            int delta = (int) Math.random();
            boolean increment = Math.random() < 0.5;
            addOrSubtractAndPrint(initValue, delta, increment);
        }

    }
}

