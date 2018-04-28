package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> resultfilter = new ArrayList<>();
        int sizearry = array.size();

        for(int i = 0; i < sizearry; i++){
            if(array.get(i) % 2 == 0){
                resultfilter.add(array.get(i));
            }
        }
        return resultfilter;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> resultthree = new ArrayList<>();

        for(int i = 0; i < array.size(); i++){
            if(array.get(i) % 3 == 0){
                resultthree.add(array.get(i));
            }
        }
        return resultthree;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
      //  List<Integer> resultcomment = new ArrayList<>();
      //  int sizearry = firstList.size();
//
      //  for(int i = 0; i < sizearry; i++){
      //      for(int j = 0; j < sizearry; j++){
      //          if(firstList.get(i) == secondList.get(j)){
      //              resultcomment.add(firstList.get(i));
      //          }
      //      }
      //  }
      //  return resultcomment;
        return firstList.stream().filter(secondList::contains).collect(Collectors.toList());
    }

    public List<Integer> getDifferentElements() {
       // List<Integer> resultdifferent = new ArrayList<>();
       // int sizearry = array.size();
//
       // resultdifferent.addAll(array);
       // for(int i = 0; i < sizearry; i++){
       //     for(int j = i + 1; j < sizearry; j++){
       //         if(resultdifferent.get(i) == resultdifferent.get(j)){
       //             resultdifferent.remove(j);
       //             --j;
       //             --sizearry;
       //         }
       //     }
       // }
       // return resultdifferent;

        return new ArrayList<>(new HashSet<>(array));
    }
}