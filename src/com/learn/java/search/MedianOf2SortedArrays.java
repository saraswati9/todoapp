package com.learn.java.search;

import java.util.Arrays;

public class MedianOf2SortedArrays {
    public static void main(String[] args) {
        int res = getMedian(new int[]{1,2}, new int[]{3,4}, 2, 2);
        System.out.println("res is: "+res);
    }
    public static int getMedian(int[] ar1, int[] ar2, int n, int m) {
        // Merge the arrays into a single sorted array.
        int[] merged = new int[n + m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            merged[k++] = ar1[i];
        }
        for (int i = 0; i < m; i++) {
            merged[k++] = ar2[i];
        }
        // Sort the merged array.
        Arrays.sort(merged);
        // Calculate the total number of elements in the merged array.
        int total = merged.length;
        if (total % 2 == 1) {
            // If the total number of elements is odd, return the middle element as the median.
            return (int) merged[total / 2];
        } else {
            // If the total number of elements is even, calculate the average of the two middle elements as the median.
            int middle1 = merged[total / 2 - 1];
            int middle2 = merged[total / 2];
            return (int) (((double) middle1 + (double) middle2) / 2.0);
        }
    }
}
