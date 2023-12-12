package ru.otus.nikolaeva.homework11;

public class Node<String> {
    public String data;
    public Node pre;
    public Node next;

    public Node(String data, Node<String> pre, Node<String> next) {
        this.data = data;
        this.pre = pre;
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
