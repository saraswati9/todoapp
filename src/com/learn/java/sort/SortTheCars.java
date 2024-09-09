package com.learn.java.sort;

import java.util.Map;
import java.util.TreeMap;

public class SortTheCars {
    public static void main(String[] args) {
        String cars = "ssgysyqa";
        sortCars(cars);
    }
    private static void sortCars(String cars) {
        TreeMap<Character, Integer> carMap = new TreeMap<>();
        for (int i=0; i<cars.length(); i++) {
            char ch = cars.charAt(i);
            int count = 1;
            if(carMap.containsKey(ch)) {
                int val = carMap.get(ch);
                val++;
                carMap.put(ch, val);
            } else {
                carMap.put(ch, count);
            }
        }
        System.out.println("carMap values are: "+carMap);
        //carMap.entrySet().stream(Map.Entry.comparingByValue());
    }
}
