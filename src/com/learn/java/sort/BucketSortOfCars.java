package com.learn.java.sort;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BucketSortOfCars {
    public static void main(String[] args) {
        System.out.println("start time: "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
        String str = "ssgysyqassssssssssssssssssssssssssssqqqaaayyymmmnnn";
        String res = bucketSortCars(str);
        System.out.println("res val is: " + res);
        System.out.println("end time: "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
    }

    public static String bucketSortCars(String cars) {
        // Count the frequency of each car
        Map<Character, Integer> carCount = new HashMap<>();
        for (char car : cars.toCharArray()) {
            carCount.put(car, carCount.getOrDefault(car, 0) + 1);
        }
        // Find the maximum frequency
        int maxFrequency = 0;
        for (int freq : carCount.values()) {
            maxFrequency = Math.max(maxFrequency, freq);
        }
        // Create buckets
        List<List<Character>> buckets = new ArrayList<>();
        for (int i = 0; i <= maxFrequency; i++) {
            buckets.add(new ArrayList<>());
        }
        // Insert cars into buckets
        for (Map.Entry<Character, Integer> entry : carCount.entrySet()) {
            buckets.get(entry.getValue()).add(entry.getKey());
        }
        // Sort each bucket and build the result string
        StringBuilder result = new StringBuilder();
        for (int i = maxFrequency; i > 0; i--) {
            Collections.sort(buckets.get(i));
            for (char car : buckets.get(i)) {
                char[] chars = new char[i];
                Arrays.fill(chars, car);
                result.append(new String(chars));
            }
        }
        return result.toString();
    }
}
