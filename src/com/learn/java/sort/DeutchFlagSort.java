package com.learn.java.sort;

public class DeutchFlagSort {
    public void dutchFlagSort(int[] nums, int n) {
        for (int i=0; i<n/2; i++) {
            for (int j=0; j<n; j++) {
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
    }
}
