package com.learn.java.list;

import java.util.*;

public class NextLeastGreaterEleOnRight {
    public static void main(String[] args) {
        int[] arr = {8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28};
        ArrayList<Integer> resList = findLeastGreater(arr.length, arr);
        System.out.println("res list: " + resList);
    }

    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        ArrayList<Integer> resList = new ArrayList<>();
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int cur = arr[i];
            if (cur >= 1) {
                int diff = 0, min = 0;
                for (int j = i + 1; j < len; j++) {

                }
            }
        }
        return resList;
    }
}
