package com.learn.java.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 5, 3, 7));
        mergeSort(arr, 0, arr.size()-1);
        System.out.println("resArr value is: "+arr);
    }
    public static void mergeSort(ArrayList<Integer> arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            mergeArr(arr, left, mid, right);
        }
    }
    private static void mergeArr(ArrayList<Integer> arr, int left, int mid, int right) {
        int n1 = mid-left+1, n2 = right-mid;
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for (int i=0; i<n1; i++) {
            lArr[i] = arr.get(left+i);
        }
        for (int j=0; j<n2; j++) {
            rArr[j] = arr.get(mid+1+j);
        }
        int i=0, j=0, k=left;
        while (i<n1 && j<n2) {
            if (lArr[i] <= rArr[j]) {
                arr.set(k, lArr[i]);
                i++;
            } else {
                arr.set(k, rArr[j]);
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr.set(k, lArr[i]); i++; k++;
        }
        while (j < n2) {
            arr.set(k, rArr[j]); j++; k++;
        }
    }
}
