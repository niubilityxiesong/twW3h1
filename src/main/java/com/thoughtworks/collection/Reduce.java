package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.xml.soap.Node;
import java.util.*;
import java.util.stream.Stream;

public class Reduce {

    List<Integer> arrayList;
    public creatlink mylink;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
        mylink = new creatlink();
    }


    public int getMaximum() {
        int resultmax;

        Collections.sort(arrayList);
        resultmax = arrayList.get(arrayList.size() - 1);
        return resultmax;
    }

    public double getMinimum() {
        int resultmin;

        Collections.sort(arrayList);
        resultmin = arrayList.get(0);
        return resultmin;
    }

    public double getAverage() {
      // double resultavg = 0.0;
      // int sizearry = arrayList.size();

      // for(int i = 0; i < sizearry; i++){
      //     resultavg += arrayList.get(i);
      // }
      // resultavg = resultavg / sizearry;
      // return resultavg;
        return arrayList.stream().mapToDouble(value -> value).average().getAsDouble();
    }

    public double getOrderedMedian() {
        double resultmedia = 0.0;
        int num;

        num = arrayList.size() % 2;
        if(num != 0){
            num = arrayList.size() / 2;
            resultmedia = arrayList.get(num);
        }
        else {
            num = arrayList.size() / 2;
            resultmedia = (double)arrayList.get(num) + (double)arrayList.get(num - 1);
            resultmedia =resultmedia / 2;
        }
        return resultmedia;
    }

    public int getFirstEven() {
       // int resultfirsteven = 0;
//
       // for(int i = 0; i < arrayList.size(); i++){
       //     if(arrayList.get(i) % 2 == 0){
       //         resultfirsteven = arrayList.get(i);
       //         break;
       //     }
       // }
       // return resultfirsteven;
        return arrayList.stream().filter(value -> value % 2 == 0).findFirst().get();
    }

    public int getIndexOfFirstEven() {
       // int resultindex = 0;
//
       // for(int i = 0; i < arrayList.size(); i++){
       //     if(arrayList.get(i) % 2 == 0){
       //         resultindex = i;
       //         break;
       //     }
       // }
       // return resultindex;
        return arrayList.indexOf(arrayList.stream().filter(value -> value % 2 == 0).findFirst().get());
    }

    public boolean isEqual(List<Integer> arrayList) {
        boolean judge;

        judge = this.arrayList.equals(arrayList);
        return judge;
    }

    //实现接口SingleLink，然后再此函数内使用

    public double getMedianInLinkList(SingleLink singleLink) {
        int sizearry = arrayList.size();
        double media = sizearry / 2;

        for(int i = 0; i < sizearry; i++){
            mylink.addNode(arrayList.get(i));
            singleLink.addTailPointer(mylink);
        }
        while(media != 1){
            mylink.head = mylink.head.next;
            --media;
        }
        if(sizearry % 2 != 0){
            return mylink.head.data;
        }
        else {
            return (double) (mylink.head.data + mylink.head.next.data) / 2;
        }

    }

    public int getLastOdd() {
       // int resultlastodd = 0;
//
       // for(int i = 0; i < arrayList.size(); i++){
       //     if(arrayList.get(i) % 2 != 0){
       //         resultlastodd = arrayList.get(i);
       //     }
       // }
       // return resultlastodd;
        return arrayList.stream().reduce(0, (result, num) -> {
            if(num % 2 != 0){
                result = num;
            }
            return result;
        });
    }

    public int getIndexOfLastOdd() {
       // int resultlastindex = 0;
//
       // for(int i = 0; i < arrayList.size(); i++){
       //     if(arrayList.get(i) % 2 != 0){
       //         resultlastindex = i;
       //     }
       // }
       // return resultlastindex;

        return arrayList.lastIndexOf(arrayList.stream().reduce(0,(index, num) -> {
            if(num % 2 != 0)
                return num;
            return index;
        }));
    }

}

