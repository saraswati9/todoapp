package com.learn.java.arrays;

public class MaximumSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2,1,1,3,5,8,9,3,8,1,1,2,4};
        int maxSum = maximumSumSubarray(arr, 3);
        System.out.println("maxSUm is : "+maxSum);
    }

    private static int maximumSumSubarray(int[] arr, int k) {
        int i=0, j=0, sum = 0, max = 0;
        int size = arr.length;
        while (j<size) {
            sum = sum + arr[j];
            if (j-i+1 < k) {
                j++;
            } else if (j-i+1 == k) {
                max = Math.max(max, sum);
                sum = sum - arr[i];
                i++; j++;
            }
        }
        return max;
    }

}
