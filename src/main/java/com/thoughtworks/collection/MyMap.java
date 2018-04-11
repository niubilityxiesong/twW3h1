package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> resulttriple = new ArrayList<>();
        int temp;

        for(int i = 0; i < array.size(); i++){
            temp = array.get(i);
            temp = temp * 3;
            resulttriple.add(temp);
        }
        return resulttriple;
    }

    public List<String> mapLetter() {
        List<String> resultmap = new ArrayList<>();

        for(int i = 0; i < array.size(); i++){
            resultmap.add(letterList.get(array.get(i) - 1));
        }
        return resultmap;
    }

    public List<String> mapLetters() {
        List<String> resultmaps = new ArrayList<>();
        String temp = new String();
        int firstarry,secendarry;

        for(int i = 0; i < array.size(); i++){
            if(array.get(i) < 27){
                temp = letterList.get(array.get(i) - 1);
            }
            else {
                firstarry = array.get(i) / 26;
                secendarry = array.get(i) % 26;
                if(secendarry != 0){
                    temp = letterList.get(firstarry - 1) + letterList.get(secendarry - 1);
                }
                else {
                    temp = letterList.get(firstarry - 2) + letterList.get(25);
                }

            }
            resultmaps.add(temp);
        }
        return resultmaps;
    }

    public List<Integer> sortFromBig() {
        List<Integer> resultsort = new ArrayList<>();

        resultsort.addAll(array);
        Collections.reverse(resultsort);
        return resultsort;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> resultsort = new ArrayList<>();

        resultsort.addAll(array);
        Collections.sort(resultsort);
        return resultsort;
    }
}
