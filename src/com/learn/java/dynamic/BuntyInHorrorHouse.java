package com.learn.java.dynamic;

public class BuntyInHorrorHouse {
    private int sum = 0;
    public static void main(String[] args) {
        int[][] arr = {{1,0},{0,1}};//{{1,0,0},{1,0,0},{1,1,1}};
        escape(arr.length, arr);
    }
    public static void escape(int n, int[][] arr) {
        boolean b = false;
        for (int i=0; i<n; i++) {
            int count  = 0;
            for (int j=0; j<arr[i].length;j++) {
                if (arr[i][j] >= 0 && arr[i][j] <= 1) {
                    if (arr[i][j] == 1) {
                        count++;
                    }
                }
            }
            if (count == arr[i].length) {
                b = true;
            }
        }
        if (b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
