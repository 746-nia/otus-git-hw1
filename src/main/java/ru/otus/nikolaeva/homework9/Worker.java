package ru.otus.nikolaeva.homework9;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private int age;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public ArrayList<String> listNameOfWorker(List<Worker> list) {
        ArrayList<String> nameList = new ArrayList<>();
        for (Worker worker: list
             ) {nameList.add(worker.getName());
        }
        System.out.println(nameList);
        return nameList;
    }

    public ArrayList<String> listAgeOfWorker(List<Worker> list, int minAge) {
        ArrayList<String> workerListWithAgeIncreaseMin = new ArrayList<>();
        for (Worker worker:list) {
            if(worker.getAge() >= minAge){
                workerListWithAgeIncreaseMin.add(worker.getName());
            }
        }
        System.out.println(workerListWithAgeIncreaseMin);
        return workerListWithAgeIncreaseMin;
    }

    public boolean listAgeOfWorkerStr(List<Worker> list, int age){
        int srAge = 0;
        for(Worker worker: list) {
            srAge += worker.getAge();
        }
        int count = srAge/list.size();
        if(count >= age){
            System.out.println("Средний возраст сотрудников больше " + age);
            return true;
        }
        System.out.println("NO");
        return false;
    }

    public List<Object> listWorkerWithMaxAge(List<Worker> list) {
        List<Object> workerListWithAgeIncreaseMax = new ArrayList<>();
        int max =0;
        for(Worker worker: list){
            if(worker.getAge() >= max){
                max = worker.getAge();
                name = worker.getName();
            }
        }
        workerListWithAgeIncreaseMax.add(max);
        workerListWithAgeIncreaseMax.add(name);
        System.out.println(workerListWithAgeIncreaseMax);
        return workerListWithAgeIncreaseMax;
    }

    public String listWorkerWithMinAge(List<Worker> list) {
        int min = Integer.MAX_VALUE;
        for(Worker worker: list){
            if(worker.getAge() <= min){
                min = worker.getAge();
                name = worker.getName();
            }
        }
        return name;
    }
}
