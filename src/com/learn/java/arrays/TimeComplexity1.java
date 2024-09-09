package com.learn.java.arrays;

public class TimeComplexity1 {
    public static int cnt = 0;
    public static void print() {
        cnt++;
    }
    public static void solve(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                for (int k = i; k >= i - 1; k--) {
                    print();
                }
            }
        }
        System.out.println("cnt value is: "+cnt);
    }

    public static void main(String[] args) {
        solve(3);
    }
}
