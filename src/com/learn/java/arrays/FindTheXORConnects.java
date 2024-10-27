package com.learn.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheXORConnects {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int count = solve(l1, l2);
        System.out.println(count);
    }
    public static int solve(ArrayList<Integer> a, ArrayList<Integer> b) {
        int len = a.size(), count = 0;
        for (int i=0; i<len; i++) {
            if (b.contains(a.get(i))) {
                count++;
            }
        }
        return count;
    }
}
