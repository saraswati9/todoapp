package com.learn.java.sort;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7,8,9};
        printArray(n);
    }
    public static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i=i+2) {
            int temp = arr[i];
            if (i+1 <= arr.length-1) {
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("waved array is: "+ Arrays.toString(arr));
    }

}
