package com.learn.java.algorithms.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberWithLargestFrequency {

    public static void main(String args[]) {
        int[] arr = {5, 5, 5, 6, 6, 6, 7, 7, 8};
        //int[] arr = {10,1,1,1,1,1,1,2,2,2,2,2,2};
        int lowestOfNums = mostFrequent(arr);
        System.out.println("lowestOfNums: " + lowestOfNums);
    }

    public static int mostFrequent(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], count);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> freqEntry = map.entrySet();
        int maxCountVal = 0, lowestOfNums = 0, maxCountKey = 0;
        boolean flag = false;
        for (Map.Entry<Integer, Integer> val : freqEntry) {
            if (val.getValue() > maxCountVal) {
                maxCountKey = val.getKey();
                maxCountVal = val.getValue();
            } else if (val.getValue() == maxCountVal) {
                flag = true;
                if (val.getKey() < maxCountKey) {
                    lowestOfNums = val.getKey();
                } else {
                    lowestOfNums = maxCountKey;
                }
            }
        }
        if (flag) {
            return lowestOfNums;
        } else {
            return maxCountVal;
        }
    }
}
