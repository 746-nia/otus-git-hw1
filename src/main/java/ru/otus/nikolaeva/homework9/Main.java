package ru.otus.nikolaeva.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {6,20,3,4,-5,6};
        createArrayList(5,10);
        sumEl(new ArrayList<Integer>(Arrays.asList(array)));
        listChangeElement(10,new ArrayList<Integer>(Arrays.asList(array)) );
        listIncreaseElementForNumber(10, new ArrayList<Integer>(Arrays.asList(array)));


        Worker worker = new Worker("Nina", 15);
        Worker worker2 = new Worker("Tom", 35);
        Worker worker3 = new Worker("Ann", 25);
        List<Worker> workerList = new ArrayList<>();
        workerList.add(worker);
        workerList.add(worker2);
        workerList.add(worker3);
        worker.listNameOfWorker(workerList);
        worker.listAgeOfWorker(workerList, 16);
        worker.listAgeOfWorkerStr(workerList, 14);
        worker.listWorkerWithMinAge(workerList);

    }

    public static ArrayList<List> createArrayList(int min, int max){
        ArrayList<List> arrayList = new ArrayList<>();
        while(min != max){
            arrayList.add(Collections.singletonList(min));
            min += 1;
        }
        arrayList.add(Collections.singletonList(max));
        System.out.println(arrayList);
        return arrayList;
    }
    public static int sumEl(ArrayList<Integer> arrayList){
        int sum =0;
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) > 5){
                sum += arrayList.get(i);
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static ArrayList<Integer> listChangeElement( int el, ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i,el);
        }
        System.out.println(arr);
        return arr;
    }

    public static ArrayList<Integer> listIncreaseElementForNumber( int num, ArrayList<Integer> arr) {
        for (int i = 0; i <arr.size() ; i++) {
            arr.set(i, (arr.get(i) + num));
        }
        System.out.println(arr);
        return arr;
    }
}
