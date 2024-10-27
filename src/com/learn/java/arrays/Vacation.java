package com.learn.java.arrays;

public class Vacation {
    public static void main(String[] args) {
        int[] weather =  {0,3,-2,5,-4,-4};           //{-5,0,-10};
        solve(weather, weather.length, 1, 3);
    }
    public static void solve(int[] weather, int n, int days, int temp) {
        int l=0, r=weather.length, tot = 0;
        while(l<r) {
            int count = 0;
                while (weather[l] <= temp) {
                    count++;
                    l++;
                    if (l >= r) {
                        break;
                    }
                }
                l++;
                if (count >= days) {
                tot = suitableDays(count, tot);
                }
            }
        System.out.println("count is: "+tot);
    }
    private static int suitableDays(int count, int tot) {
        int sum = 0;
        for (int i=count; i>0; i--) {
            sum = sum + i;
        }
        tot = tot + sum; //6
        return tot;
    }
    /*for (int i=0; i<n; i=i+days) {
            int[] arr = new int[days];
            for (int j=i; j<arr.length; j++) {
                if (weather[j] <= temp) {
                    arr[j] = weather[i];
                }
            }
            count++;
        }
        if (weather[i] <= temp) {
                count++;
            }*/
}
