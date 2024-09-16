package com.learn.java.sort;

public class SpecialPairOfScores {
    public static void main(String[] args) {
        long[] arr = {8,4,2,1,5,3};
        long res = inversionCount(arr, arr.length);
        System.out.println("count is: "+res);
    }
    public static long inversionCount(long[] arr, int N) {
        long count = 0;
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                if (arr[j] < arr[i]) {
                    count++;
                }
            }
        }
        return count;
    }

}
