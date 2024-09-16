package com.learn.java.sort;

import java.util.Arrays;

public class SortZeroToTwo {
    public static void main(String[] args) {
        int[] nums = {1,0,2,1,0,2,1,0};
        dutchFlagSort(nums, nums.length);
    }
    public static void dutchFlagSort(int[] nums, int n) {
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-1; j++) {
                if (nums[i] == 0 || nums[i] == 1 || nums[i] == 2) {
                    if (j+1 < n) {
                        if (nums[j] > nums[j + 1]) {
                            int temp = nums[j];
                            nums[j] = nums[j + 1];
                            nums[j + 1] = temp;
                        }
                    }
                }
            }
        }
        System.out.println("nums value is: "+ Arrays.toString(nums));
    }
}
