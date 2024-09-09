package com.learn.java.complex;

public class TimeComplexity2 {
    public int cnt = 0;
    public void print() {
        cnt++;
    }
    public void solve(int n) {
        for (int i = n; i > 0; i = i / 2) {
            for (int j = 0; j <= i; j = j + 1) {
                print();
            }
        }
        System.out.println("cnt value is: "+cnt);
    }
    public static void main(String[] args) {
        new TimeComplexity2().solve(8);
    }
}
