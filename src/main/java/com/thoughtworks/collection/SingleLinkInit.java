package com.thoughtworks.collection;


import javax.xml.soap.Node;
import java.util.ArrayList;

import java.util.List;

public class SingleLinkInit implements SingleLink<creatlink>{


    class Node{
        int num;
        Node next;
    }
    List<Integer> arrayList = new ArrayList<>();

    public creatlink getHeaderData(){
        creatlink mylink = new creatlink();

        return mylink;
    }

    public creatlink getTailData(){
        creatlink mylink = new creatlink();

        return mylink;
    }

    public int size(){
        int resultnum = 0;


        return resultnum;
    }

    public boolean isEmpty(){
        return true;
    }

    public boolean deleteFirst(){
        return true;
    }

    public boolean deleteLast(){
        return true;
    }

    public void addHeadPointer(creatlink item){
        return;
    }

    public void addTailPointer(creatlink item){
        Node newnode = new Node();

        return;
    }

    public creatlink getNode(int index){
        Reduce uselink = new Reduce(arrayList);
        while (index != 0){
            uselink.mylink.head = uselink.mylink.head.next;
            --index;
        }
        System.out.println(uselink.mylink.head.data);
        return uselink.mylink;
    }
}