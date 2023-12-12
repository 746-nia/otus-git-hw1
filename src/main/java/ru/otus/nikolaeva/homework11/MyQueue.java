package ru.otus.nikolaeva.homework11;

public class MyQueue {
    private MyLinkedList queue = new MyLinkedList();
    public void offer(String d) {
        queue.addLast(d);
    }

    public void pool(String d){
        queue.remove(0);
    }
}
