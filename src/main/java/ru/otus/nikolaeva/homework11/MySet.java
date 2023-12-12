package ru.otus.nikolaeva.homework11;

public class MySet {
    private MyLinkedList stack = new MyLinkedList();
    public void push(String d){
        stack.addFirst(d);
    }

    public void pop(String d) {
        if(stack == null){
            System.out.println("не получается");
        }
        stack.remove(0);
    }
}
