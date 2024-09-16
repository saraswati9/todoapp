package com.learn.java.search;

public class SqaureRootOfX {
    public static void main(String[] args) {
        int res = solve(2);
        System.out.println("res: "+res);
    }
    public static int solve(int n) {
        // For special cases when x is 0 or 1, return x.
        if (n == 0 || n == 1)
            return n;
        // Initialize the search range for the square root.
        int start = 1;
        int end = n;
        int mid = -1;
        // Perform binary search to find the square root of x.
        while (start <= end) {
            // Calculate the middle point using "start + (end - start) / 2" to avoid integer overflow.
            mid = start + (end - start) / 2;
            // If the square of the middle value is greater than x, move the "end" to the left (mid - 1).
            if ((long) mid * mid > (long) n)
                end = mid - 1;
            else if (mid * mid == n)
                // If the square of the middle value is equal to x, we found the square root.
                return mid;
            else
                // If the square of the middle value is less than x, move the "start" to the right (mid + 1).
                start = mid + 1;
        }
        // The loop ends when "start" becomes greater than "end", and "end" is the integer value of the square root.
        // However, since we might have been using integer division in the calculations,
        // we round down the value of "end" to the nearest integer to get the correct square root.
        return Math.round(end);
    }
}
