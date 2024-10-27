package com.learn.java.collections.map.set;

import java.util.*;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,3,2,10,15);
        int indexDiff = 1;
        int res = minAbsoluteDifference(nums, indexDiff);
        System.out.println("res: " + res);
    }

    public static int minAbsoluteDifference(List<Integer> nums, int x) {
        int res = 0, size = nums.size();
        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                int diff = 0;
                if (nums.get(i) > nums.get(j)) {
                    diff = nums.get(i) - nums.get(j);
                } else {
                    diff = nums.get(j) - nums.get(i);
                }
                if (diff == x) {
                    return res = i;
                }
            }
        }
        return res;
    }
}
