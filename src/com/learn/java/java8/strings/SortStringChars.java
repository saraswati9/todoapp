package com.learn.java.java8.strings;

import java.util.*;

public class SortStringChars {
    private static String cars = "ssgysyqa";
    public static void main(String[] args) {
        String res = bucketSortCars(cars);
        System.out.println("Result is: "+res);
    }
    static String bucketSortCars(String cars) {
        String res = "";
        Map<Character, Integer> map = new TreeMap<>();
        for(int i=0; i<cars.length(); i++) {
            char ch = cars.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println("map values are: "+map);
        StringBuffer sb = new StringBuffer();
        List<Map.Entry<Character, Integer>> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList();
        System.out.println("sorted values are: "+sorted);
        for (Map.Entry<Character, Integer> entry : sorted) {
            for (int i=0; i<entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
