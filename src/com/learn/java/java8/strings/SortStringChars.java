package com.learn.java.java8.strings;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class SortStringChars {
    private static String cars = "ssgysyqassssssssssssssssssssssssssssqqqaaayyymmmnnn";
    public static void main(String[] args) {
        System.out.println("start time: "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
        String res = bucketSortCars(cars);
        System.out.println("Result is: "+res);
        System.out.println("end time: "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
    }
    static String bucketSortCars(String cars) {
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
        Stream<Map.Entry<Character, Integer>> sorted = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
        for (Map.Entry<Character, Integer> entry : sorted.toList()) {
            for (int i=0; i<entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
