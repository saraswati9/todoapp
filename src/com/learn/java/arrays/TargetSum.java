package com.learn.java.arrays;

public class TargetSum {

    public static int solve(int[] ar, int n, int k) {
        int count=0, sum=0;
        for( int i=0; i<n; i++) {
            for (int j=i+1; j<n && j!=i; j++) {
                if (ar[i] == k) {
                    count++;
                }
                if (sum <= k) {
                    sum = sum + ar[i];
                    if (sum == k) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //int[] ar = {10,5,1,2,3,4,5,6,7,8,9,10}; k=5
        //int[] ar = {7,8,10,1,2,7,6,1,5}; k=8
        int[] ar = {1,2,1,2,3};
        int count = solve(ar, ar.length, 4);
        System.out.println("count is: "+count);
    }

    /*public static int solve(int[] ar, int n, int k) {
        int count=0;
        for( int i=0; i<n; i++) {
            if (ar[i]==k) {
                count++;
            }
            for (int j=i+1; j<n && j!=i; j++) {
                int sum=0;
                sum = ar[i]+ar[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }*/



}
