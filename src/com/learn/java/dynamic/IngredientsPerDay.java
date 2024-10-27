package com.learn.java.dynamic;

public class IngredientsPerDay {
    public static void main(String[] args) {
        System.out.println(solve(10, 6));
    }
    public static int solve(int n, int ingredientsPerDay) {
        int res = 0;
        if (n >= 1 && n <= 20 && ingredientsPerDay >= 1 && ingredientsPerDay <= 100) {
            res = n * ingredientsPerDay;
        }
        return res;
    }
}
