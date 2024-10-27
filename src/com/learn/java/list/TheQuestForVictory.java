package com.learn.java.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TheQuestForVictory {
    public static void main(String[] args) {
        List<Pair<String, Integer>> input = new ArrayList<>();
        input.add(new Pair<>("mike", 3));
        input.add(new Pair<>("andrew", 5));
        input.add(new Pair<>("mike", 2));
        int n = 3;
        String res = winner(input, n);
        System.out.println("res value is: "+res);
    }
    public static String winner(List<Pair<String, Integer>> input, int N) {
        String res = "";
        int containsMax = 0, newMax = 0;
        String cString = "", nString = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(Pair<String, Integer> i : input) {
            if (map.containsKey(i.getKey())) {
                int val = i.getValue();
                int oldVal = map.get(i.getKey());
                int newVal = val + oldVal;
                if (containsMax < newVal) {
                    containsMax = newVal;
                    cString =i.getKey();
                }
                map.put(i.getKey(), newVal);
            } else {
                map.put(i.getKey(), i.getValue());
                if (newMax < i.getValue()) {
                    newMax = i.getValue();
                    nString = i.getKey();
                } else if (newMax == i.getValue()) {

                }
            }
        }
        res = containsMax > newMax ? cString : nString;
        return res;
    }
}
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
class Solution {
    public String winner(List<Pair<String, Integer>> input, int N) {
        String res = "", cString = "", nString = "";
        int containsMax = 0, newMax = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(Pair<String, Integer> i : input) {
            if (map.containsKey(i.getKey())) {
                int val = i.getValue();
                int oldVal = map.get(i.getKey());
                int newVal = val + oldVal;
                if (containsMax < newVal) {
                    containsMax = newVal;
                    cString =i.getKey();
                }
                map.put(i.getKey(), newVal);
            } else {
                map.put(i.getKey(), i.getValue());
                if (newMax < i.getValue()) {
                    newMax = i.getValue();
                    nString = i.getKey();
                }
            }
        }
        res = containsMax > newMax ? cString : nString;
        return res;
    }
}
