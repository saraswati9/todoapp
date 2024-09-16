package com.learn.java.arrays;

import java.util.Arrays;

public class SoloSum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        int[] resArr = leftRightSum(nums);
        System.out.println("resArr is: "+ Arrays.toString(resArr));
    }
    public static int[] leftRightSum(int[] nums) {
        int length = nums.length;
        int[] resArr = new int[length];
        for(int i=0; i<length; i++) {
            int lSum = leftSum(i, nums);
            int rSum = rightSum(i, nums);
            int total = lSum + rSum;
            resArr[i] = total;
        }
        System.out.println("resArr is: "+ Arrays.toString(resArr));
        return resArr;
    }
    public static int leftSum(int index, int[] nums) {
        int lSum = 0;
        for (int i=index-1; i>=0 && i<index; i--) {
            lSum += nums[i];
        }
        System.out.println("lSum is: "+lSum);
        return lSum;
    }
    public static int rightSum(int index, int[] nums) {
        int rSum = 0;
        for (int i=index+1; i<nums.length; i++) {
            rSum += nums[i];
        }
        System.out.println("rSum is: "+rSum);
        return rSum;
    }
}
