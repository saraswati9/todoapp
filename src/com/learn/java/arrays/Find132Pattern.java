package com.learn.java.arrays;

public class Find132Pattern {
    public static void main(String[] args) {
        int[] nums = {-1,2,3,0};//{3, 1, 4, 2};
        System.out.println(find132pattern(nums));
    }
    public static boolean find132pattern(int[] nums) {
        int len = nums.length, l = 0, m = 1, r = 2;
        boolean b = false;
        while (r < len) {
            if (nums[l] < nums[r] && nums[m] > nums[r]) {
                b = true;
            }
            l++; m++; r++;
        }
        return b;
    }
}
