package ru.otus.nikolaeva.homework2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        printString("Hello World!", 5);
        summaryOfElementMoreFive(new int[]{1, 1, 1, 1, 5});
        replaceElementInArray(new int[]{1, 1, 1, 5}, 10);
        addElToArr(new int[]{1, 1, 1, 2}, 5);
        sumElPartOfArr(new int[]{1, 1, 1, 2, 3});
    }

    public static void printString(String arg, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(arg);
        }
    }

    public static void summaryOfElementMoreFive(int[] array) {
        int summary = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                summary = summary + array[i];
            }
        }
        System.out.println(summary);
    }

    public static void replaceElementInArray(int[] array, int el) {
        for (int i = 0; i < array.length; i++) {
            array[i] = el;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void addElToArr(int[] array, int el) {
        for (int i = 0; i < array.length; i++) {
            array[i] += el;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void sumElPartOfArr(int[] array) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sum1 += array[i];
        }
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            sum2 += array[i];
        }
        if (sum1 > sum2) {
            System.out.println("Больше первая часть массива. Она равна " + sum1);
        }
        if (sum2 > sum1) {
            System.out.println("Больше вторая часть массива. Она равна " + sum2);
        } else {
            System.out.println("Суммы половин частей массива равны " + sum1);
        }
    }
}
