package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> resulttransform = new ArrayList<>();


        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                resulttransform.add(array[i][j]);
            }
        }
        return resulttransform;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> resultdimesional = new ArrayList<>();
        int i,j;
        int sizearry;

        for(i = 0; i < array.length; i++){
            for(j = 0; j < array[i].length; j++){
                resultdimesional.add(array[i][j]);
            }
        }

        sizearry = resultdimesional.size();
        for(i = 0; i < sizearry; i++){
            for(j = i + 1; j < sizearry; j++){
                if(resultdimesional.get(i) == resultdimesional.get(j)){
                    resultdimesional.remove(j);
                    --j;
                    --sizearry;
                }
            }
        }
        return resultdimesional;
    }
}
