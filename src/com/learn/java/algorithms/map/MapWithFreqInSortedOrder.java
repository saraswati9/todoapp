package com.learn.java.algorithms.map;

import java.util.Map;
import java.util.TreeMap;

public class MapWithFreqInSortedOrder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 3, 3};
        Map<Integer, Integer> map = mapImplementation(arr, arr.length);
        System.out.println("map data: " + map);
    }

    public static Map<Integer, Integer> mapImplementation(int[] arr, int n) {
        Map<Integer, Integer> map = new TreeMap<>();
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], count);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        return map;
    }
}
