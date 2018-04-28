package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
       // List<Integer> resultlist = new ArrayList<>();
//
       // if(left > right){
       //     for(int i = left; i > right - 1; i--){
       //         resultlist.add(i);
       //     }
       // }
       // else {
       //     for(int i = left; i < right + 1; i++){
       //         resultlist.add(i);
       //     }
       // }
       // return resultlist;


        List<Integer> result;
        if(left < right)
            return result = IntStream.rangeClosed(left, right).collect(ArrayList::new, List::add, List::addAll);
        else
            result = IntStream.rangeClosed(right, left).collect(ArrayList::new, List::add, List::addAll);
        Collections.reverse(result);
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
       // List<Integer> resulteven = new ArrayList<>();
//
       // if(right > left){
       //     for(int i = left; i < right + 1; i++){
       //         if(i % 2 == 0){
       //             resulteven.add(i);
       //         }
       //     }
       // }
       // else{
       //     for(int i = left; i > right - 1; i--){
       //         if(i % 2 == 0){
       //             resulteven.add(i);
       //         }
       //     }
       // }
       // return resulteven;

        List<Integer> result;
        if(left < right){
            result = IntStream.rangeClosed(left, right).filter(value -> value % 2 == 0).collect(ArrayList::new, List::add, List::addAll);
            return result;
        }
        else
            result = IntStream.rangeClosed(right, left).filter(value -> value % 2 == 0).collect(ArrayList::new, List::add, List::addAll);

        Collections.reverse(result);
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
       // List<Integer> resultpop = new ArrayList<>();
//
       // for(int i = 0; i < array.length; i++){
       //     if(array[i] % 2 == 0){
       //         resultpop.add(array[i]);
       //     }
       // }
       // return resultpop;
        return Arrays.stream(array).filter(value -> value % 2 == 0).collect(ArrayList::new, List::add, List::addAll);
    }

    public int popLastElment(int[] array) {
        int resultnum;
        int siezarry = array.length;

        resultnum = array[siezarry - 1];
        return resultnum;
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
       // List<Integer> resultcommon = new ArrayList<>();
       // int sizearry = firstArray.length;
//
       // for(int i = 0; i < sizearry; i++){
       //     for(int j = 0; j < sizearry; j++){
       //         if(firstArray[i] == secondArray[j]){
       //             resultcommon.add(firstArray[i]);
       //         }
       //     }
       // }
       // return resultcommon;

        List<Integer> newsecendarray = Arrays.stream(secondArray).collect(ArrayList::new, List::add, List::addAll);
        return Arrays.stream(firstArray).filter(newsecendarray::contains).collect(ArrayList::new, List::add, List::addAll);
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
    //    List<Integer> resultuncommon = new ArrayList<>();
    //    int sizearry = secondArray.length;
    //    int count;
    //    resultuncommon.addAll(Arrays.asList(firstArray));
//
    //    for(int i = 0; i < sizearry; i++){
    //        count = 0;
    //        for(int j = 0; j < sizearry; j++){
    //            if(secondArray[i] != firstArray[j]){
    //                ++count;
    //            }
    //            else {
    //                break;
    //            }
    //        }
    //        if(count == sizearry){
    //            resultuncommon.add(secondArray[i]);
    //        }
    //    }
    //    return resultuncommon;

        List<Integer> newsecondArray = Arrays.stream(secondArray).collect(Collectors.toList());
        List<Integer> newfirstArray = Arrays.stream(firstArray).collect(Collectors.toList());

        newsecondArray.removeAll(Arrays.stream(firstArray).filter(newsecondArray::contains).collect(Collectors.toList()));
        newfirstArray.addAll(newsecondArray);
        return newfirstArray;
    }


}
