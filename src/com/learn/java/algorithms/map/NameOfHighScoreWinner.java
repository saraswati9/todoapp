package com.learn.java.algorithms.map;

import java.util.*;

public class NameOfHighScoreWinner {
    public static void main(String[] args) {
        List<Pair<String, Integer>> list = new ArrayList<>();
        list.add(new Pair<>("alice", 10));
        list.add(new Pair<>("bob", 5));
        list.add(new Pair<>("alice", -3));
        list.add(new Pair<>("bob", 10));
        String winner = new NameOfHighScoreWinner().winner(list, list.size());
        System.out.println("winner is: "+winner);
    }
    public  String winner(List<Pair<String, Integer>> input, int N) {
        Map<String, Integer> map = new HashMap<>();
        for(Pair<String, Integer> p : input) {
            if (!map.containsKey(p.getKey())) {
                map.put(p.getKey(), p.getValue());
            } else {
                map.put(p.getKey(), map.get(p.getKey())+p.getValue());
            }
        }
        int maxVal = 0;
        String winner = "";
        for(Map.Entry<String, Integer> m : map.entrySet()) {
            if(m.getValue()>maxVal) {
                maxVal = m.getValue();
                winner = m.getKey();
            }
        }
        return winner;
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    // Constructor to initialize a Pair with key and value
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter method for key
    public K getKey() {
        return key;
    }

    // Getter method for value
    public V getValue() {
        return value;
    }
}
