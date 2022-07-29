package com.bridgelabz;

public class MyLinkedList<K> {
    public INode<K> tail;
    public INode<K> head;

    public void add(INode<K> newNode){
        if (this.tail == null){
            this.tail = newNode;
        }
        if (this.head == null){
            this.head = newNode;
        }
        else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    public K search(K key) {
        INode<K> tempNode = head;
        while (tempNode != null){
            if (tempNode.getKey() == key){
                return (K) tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }
    public void append(INode<K> myNode) {
        if (this.head == null){
            this.head = myNode;
        }
        if (this.tail != null) {
            this.tail.setNext(myNode);
        }
        else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }
    public INode<K> pop(){
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
    public INode<K> popLast(){
        INode<K> tempNode = head;
        while (!tempNode.getNext().equals(tail)){
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }
    public void printMyNode(){
        System.out.println("My node: "+head);
    }
    @Override
    public String toString() {
        return "MyLinkedListNodes{" + head + '}';
    }
}
