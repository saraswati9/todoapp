package com.learn.java.collections.map.set;

import java.util.*;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1,1,3,3,4};//{1,5,9};
        int[] arr2 = {1,2,4,5,6};//{1,4,6,8};
        unionAndIntersection(arr1, arr2, arr1.length, arr2.length);
    }
    public static void unionAndIntersection(int[] arr1, int[] arr2, int n, int m) {
        TreeSet<Integer> values = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i : arr1) {
            list.add(i);
        }
        Set<Integer> interSet = new HashSet<>();
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (list.contains(arr2[j])) {
                    interSet.add(arr2[j]);
                }
                values.add(arr1[i]);
                values.add(arr2[j]);
            }
        }
        System.out.println("set values are: "+values);
        System.out.println("intersection: "+interSet);
    }
}
