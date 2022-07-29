package com.bridgelabz;

public interface INode<K> {
    K getKey();
    INode<K> getNext();
    Object getValue();
    void setNext(INode<K> tempNode);
}
