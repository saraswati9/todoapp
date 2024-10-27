package com.learn.java.string;

public class NumOfSubarraysWithGivenSum {
    public static void main(String[] args) {
        //int[] numArr = {10,1,4,2,3};
        int[] numArr = {10, 31, -1, 32, 3980, -8, 39, 40, 31, -31, 31, 11};
        int count = findSubarraySum(numArr, numArr.length, 31);
        System.out.println("count is: " + count);
    }

    static int findSubarraySum(int arr[], int n, int k) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int sum = arr[i];
            if (sum == k) {
                count++;
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (sum <= 1000 && arr[j] <= 1000) {
                    sum = sum + arr[j];
                    if (sum == k) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
