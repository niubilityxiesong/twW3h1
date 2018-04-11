package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> resultdivide = new ArrayList<>();

        number -= 2;
        while (number > 0){
            resultdivide.add(number);
            number -= 2;
        }

        return resultdivide;
    }
}
