package ru.otus.nikolaeva.homework11;

public class MyLinkedList {
    private Node<String> first;
    private Node<String> last;
    private int size;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean addFirst(String t) {
        Node<String> next = first;
        next.setData(t);
        first = new Node<>(null, null, next);
        next.setPre(first);
        size++;
        return true;
    }
    public String getFirst() {
        return first.getData();
    }

    public boolean addLast(String t){
        Node<String> prev = last;
        prev.setData(t);
        last = new Node<>(null, prev, null);
        prev.setNext(last);
        size++;
        return true;
    }

    public String getLast() {
        return last.getData();
    }

    public int getSize() {
        return size;
    }

    public boolean add(int i, String t){
        if(i<0 || i > size){
            throw new IndexOutOfBoundsException(i + " - "+ size);
        }
        if(i == size){
            return addLast(t);
        }
        Node<String> node = first.getNext();
        for (int j = 0; j < i; j++) {
            node = getNextEl(node);
        }
        Node<String> pred = node.getPre();
        Node<String> newNode = new Node<>(t, pred, node);
        node.pre = newNode;

        if(pred == null){
            first = newNode;
        }else {
            pred.next = newNode;
        }
        size++;
        return false;
    }

    public void remove(int i) {
        if(i<0 || i > size){
            throw new IndexOutOfBoundsException(i + " - "+ size);
        }
        Node<String> node = first.getNext();
        for (int j = 0; j < i; j++) {
            node = getNextEl(node);
        }
        Node<String> next = node.getNext();
        Node<String> pred = node.getPre();
        if (next == null) {
            last = pred;
        } else{
            next.pre = pred;
        }

        if (pred == null) {
            first = next;
        } else{
            pred.pre = next;
        }
        size--;
    }

    public String getElByIndex(int i) {
        if(i<0 || i > size){
            throw new IndexOutOfBoundsException(i + " - "+ size);
        }
        Node<String> node = first.getNext();
        for (int j = 0; j < i; j++) {
         node = getNextEl(node);
        }
        return node.getData();
    }

    private Node<String> getNextEl(Node<String> node) {
        return node.getNext();
    }
}
