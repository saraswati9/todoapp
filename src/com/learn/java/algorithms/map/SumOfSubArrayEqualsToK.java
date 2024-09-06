package com.learn.java.algorithms.map;

public class SumOfSubArrayEqualsToK {
    public static void main(String[] args) {
        int[] arr = {-4,4,3,3,8,-2};
        int sum = 6;
        int count = findSubarraySum(arr, arr.length, sum);
        System.out.println("possible sub arrays count is: "+count);
    }

    public static int findSubarraySum(int[] arr, int n, int sum) {
        int count = 0;
        for(int i=0; i<n; i++) {
            int val = 0;
            for(int j=0; j<=i; j++) {
                if (arr[j] == sum) {
                    count++;
                } else {
                    val += arr[j];
                    if (val == sum) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
