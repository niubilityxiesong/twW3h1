package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int resulteven = 0;

        if(leftBorder > rightBorder){
            int temp;
            temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }

        for(int i = leftBorder; i < rightBorder + 1; i++){
            if(i % 2 == 0){
                resulteven += i;
            }
        }
        return resulteven;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int resultodd = 0;

        if(leftBorder > rightBorder){
            int temp;
            temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }

        for(int i = leftBorder; i < rightBorder + 1; i++){
            if(i % 2 != 0){
                resultodd += i;
            }
        }
        return  resultodd;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int resulttwo = 0;
        int sizearry;

        sizearry = arrayList.size();
        for(int i = 0; i < sizearry; i++){
            resulttwo += arrayList.get(i) * 3 + 2;
        }
        return  resulttwo;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> resultlisttwo;
        int sizearry;
        Integer temp;

        resultlisttwo = arrayList;
        sizearry = resultlisttwo.size();
        for(int i = 0; i < sizearry; i++){
            if(arrayList.get(i) % 2 != 0){
                temp = arrayList.get(i);
                temp = temp * 3 + 2;
                arrayList.set(i, temp);
            }
        }
        return  resultlisttwo;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int resultaddodd = 0;
        int sizearry = arrayList.size();

        for(int i = 0; i < sizearry; i++){
            if(arrayList.get(i) % 2 != 0){
                resultaddodd += arrayList.get(i) * 3 + 5;
            }
        }
        return resultaddodd;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        double resultIndex = 0.0;
        int sizearry = arrayList.size();
        double temp;

        for(int i = 0; i < sizearry; i++){
            temp = (double)arrayList.get(i);
            if(temp % 2 == 0){
                resultIndex += temp;
            }
        }
        resultIndex = resultIndex / 2;
        return resultIndex;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        double resultaverange = 0.0;
        double temp;
        int count = 0;
        int sizearry = arrayList.size();

        for(int i = 0; i < sizearry; i++){
            temp = (double)arrayList.get(i);
            if(temp % 2 == 0){
                ++count;
                resultaverange += temp;
            }
        }
        resultaverange = resultaverange / count;
        return resultaverange;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        boolean judge;
        List<Integer> eventarry= new ArrayList<>();
        int sizearry = arrayList.size();
        int temp;

        for(int i = 0; i < sizearry; i++){
            temp = arrayList.get(i);
            if(temp % 2 == 0){
                eventarry.add(temp);
            }
        }
        judge = eventarry.contains(specialElment);
        return judge;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> resultevenarry = new ArrayList<>();
        int sizearry = arrayList.size();
        int temp;

        for(int i = 0; i < sizearry; i++){
            temp = arrayList.get(i);
            if(temp % 2 == 0){
                if(!resultevenarry.contains(temp)){
                    resultevenarry.add(temp);
                }
            }
        }
        return resultevenarry;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> resultsort = new ArrayList<>();
        List<Integer> oddarry = new ArrayList<>();
        List<Integer> evenarry = new ArrayList<>();
        int sizearry = arrayList.size();
        int temp;

        for(int i = 0; i < sizearry; i++){
            temp = arrayList.get(i);
            if(temp % 2 == 0){
                evenarry.add(temp);
            }
            else{
                oddarry.add(temp);
            }
        }

        Collections.sort(evenarry);
        Collections.reverse(oddarry);
        resultsort.addAll(evenarry);
        resultsort.addAll(oddarry);

        return resultsort;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<>();
        int sizearry = arrayList.size() - 1;
        int temp;

        for(int i = 0; i < sizearry; i++){
            temp = arrayList.get(i) + arrayList.get(i + 1);
            temp *= 3;
            resultList.add(temp);
        }
        return resultList;
    }
}
