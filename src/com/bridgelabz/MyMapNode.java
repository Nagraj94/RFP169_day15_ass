package com.bridgelabz;

public class MyMapNode<K,V> implements INode<K> {
    K key;
    V value;
    MyMapNode<K,V> next;
    public MyMapNode(K key, V value){
        this.key = key;
        this.value = value;
        next = null;
    }

    @Override
    public K getKey() {
        return key;
    }
    @Override
    public INode<K> getNext(){
        return next;
    }
    @Override
    public V getValue(){
        return this.value;
    }

    @Override
    public void setNext(INode<K> tempNode) {
        this.next = next;
    }
    public void setValue(V value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyMapNode{" +
                "key = " + key +
                "value = " + value +
                "next = " + next +
                '}';
    }
}

