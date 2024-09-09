package com.learn.java.complex;

public class TimeComplexity4 {
    public static int function(int k) {
        if (k <= 0) {
            return 0;
        }
        System.out.println("res value is: "+k);
        return function(k - 1) + function(k - 2);
    }
    public static void timeComplexity(int k) {
        int res = function(k);
        System.out.println("res value is: "+res);
    }

    public static void main(String[] args) {
        timeComplexity(100);
    }
}
