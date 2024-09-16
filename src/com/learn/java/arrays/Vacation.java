package com.learn.java.arrays;

public class Vacation {
    public static void main(String[] args) {
        int[] weather =  {0,3,-2,5,-4,-4};           //{-5,0,-10};
        solve(weather, weather.length, 1, 3);
    }
    public static void solve(int weather[], int n, int k, int t){
        int count = 0;
        for (int i=0; i<n; i++) {
            if (weather[i] <= t) {
                count++;
            }
        }
        for (int i=0; i<n; i=i+k) {
            int[] arr = new int[k];
            for (int j=i; j<arr.length; j++) {
                if (weather[j] <= t) {
                    arr[j] = weather[i];
                }
            }
            count++;
        }
        System.out.println("count is: "+count);
    }
}
