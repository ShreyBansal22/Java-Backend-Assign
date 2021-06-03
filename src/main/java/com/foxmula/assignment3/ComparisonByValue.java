package com.foxmula.assignment3;
import java.util.Comparator;
import java.util.HashMap;

public class ComparisonByValue implements Comparator<Integer> {
    final HashMap<Integer, Integer>mp;
    ComparisonByValue(HashMap<Integer,Integer>mp){
        this.mp=mp;
    }
    public int compare(Integer i, Integer j ){
        return mp.get(i).compareTo(mp.get(j));
    }
}
