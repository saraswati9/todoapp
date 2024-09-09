package com.learn.java.complex;

public class TimeComplexity3 {
    public int cnt = 0;
    public void timeComplexity(int n) {
        int i=1, k=0;
        while(i<n) {
            k=i;
            i*=2;
        }
        System.out.println("k value is: "+k);
    }
    public static void main(String[] args) {
        new TimeComplexity3().timeComplexity(100);
    }
}
