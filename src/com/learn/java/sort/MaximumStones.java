package com.learn.java.sort;

import java.util.Arrays;

public class MaximumStones {
    public static void main(String[] args) {
        int[] piles = {2,4,9,8,11,2};
        int sum = maximumPile(piles);
        System.out.println("sum value is: "+sum);
    }// {2,7,1,4,9,7,3,6,0,1,3,5,9,1,2} - 15
    public static int maximumPile(int[] piles) {
        int sum = 0;
        int count = 0;
        if (piles.length == 3) {
            return piles[1];
        }
        int[] arr1 = new int[piles.length/2];
        int[] arr2 = new int[piles.length/2];
        System.out.println("array values are: "+Arrays.toString(piles));
        for(int i=piles.length-2; i>=0; i=i-2) {
            arr1[count] = piles[i];
            count++;
        }
        int count1 = 0;
        Arrays.sort(arr1);
        sum = sum + arr1[1];
        System.out.println("sum val is: "+sum);
        System.out.println("pArr values are: "+Arrays.toString(arr1));
        for (int j=piles.length-1; j>=0; j=j-2) {
            arr2[count1] = piles[j];
            count1++;
        }
        Arrays.sort(arr2);
        sum = sum + arr2[1];
        System.out.println("sum val is: "+sum);
        System.out.println("pArr values are: "+Arrays.toString(arr2));
        return sum;
    }
}
