package com.thoughtworks.collection;

public class creatlink{

    Node head = null;
    class Node{
        Node next = null;
        int data;
    }

    public void addNode(int d){
        Node newnode = new Node();
        newnode.data = d;
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
}
