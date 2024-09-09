package com.learn.java.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class    KWeakestRows {
    public static void main(String[] args) {
        //int[][] mat = new int[][] {{1,1,0,0,0}, {1,1,1,1,0}, {0,0,0,0,1}, {1,1,0,0,0}, {1,1,1,1,1}};
        int[][] mat = new int[][] {{1,0},{1,0},{1,0},{1,1}};
        Arrays.stream(mat).flatMapToInt(Arrays::stream).forEach(System.out::print);
        int[] result = kWeakestRows(mat, 3);
        System.out.println("Result array is: "+Arrays.toString(result));
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i=0; i<mat.length; i++) {
            int count = 0;
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            map.put(i, count);
        }
        System.out.println(" map values are: "+map);
        List<Map.Entry<Integer, Integer>> list = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).toList();
        System.out.println(" list value is: "+list);
        int[] res = new int[k]; int count = 0;
        System.out.println("Res array values are: "+res);
        for (Map.Entry<Integer, Integer> val : list) {
            if (count < k) {
                res[count] = val.getKey();
                count++;
            }
        }
        return res;
    }
}
