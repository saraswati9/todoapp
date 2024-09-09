package com.learn.java.complex;

import static com.learn.java.arrays.TimeComplexity1.print;

public class TimeComplexity5 {
    public void timeComplexity(int n) {
        int k=0;
        for(int i=0; i<n; i++)
            for(int j=i; j<n; j++)
                k = k + 1;
        System.out.println(k);
        //int k = 0;
        for (int i = n / 2; i <= n; i++)
            for (int j = 2; j <= n; j = j * 2)
                k = k + n / 2;
        System.out.println(k);
    }

    public static void main(String[] args) {
        new TimeComplexity5().timeComplexity(50);
    }
}
