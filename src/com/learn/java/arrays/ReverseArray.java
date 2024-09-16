package com.learn.java.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] revArr = reverseArray(arr.length, arr);
        System.out.println("revArr is: "+ Arrays.toString(revArr));
    }
    public static int[] reverseArray(int n, int[] a) {
        int[] revArr = new int[a.length*2];
        int count = 0;
        for(int i=0; i<n; i++) {
            revArr[count] = a[i];
            count++;
        }
        for (int j=n-1; j>=0; j--) {
            revArr[count] = a[j];
            count++;
        }
        System.out.println("revArr is: "+ Arrays.toString(revArr));
        return revArr;
    }
}
