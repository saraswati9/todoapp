package com.learn.java.search;

import java.util.Arrays;

public class SmallesDevisorSatisfyingLimit {
    public static void main(String[] args) {
        //int res = smallestDivisor(4, new int[]{1,2,5,9}, 6);
        int res = smallestDivisor(5, new int[] {44,22,33,11,1}, 5);
        System.out.println("res value is: " + res);
    }

    public static int smallestDivisor(int n, int[] nums, int limit) {
        Arrays.sort(nums);
        int low = 1, high = nums[nums.length - 1], myAns = 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int energy = 0;
            for (int i = 0; i < nums.length; i++) {
                energy = energy + (int) Math.ceil((double) nums[i] / (double) mid);
            }
            if (energy <= limit) {
                myAns = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return myAns;
    }
}
        /*int low = 1, high = 1, ans = -1;

        for (int i : nums) {
            if (i > high) high = i;
        }

        while (low <= high) {
            int mid = (low + high) / 2;

            int val = getThreshold(nums, mid);
            if (val <= limit) {
                high = mid - 1;
                ans = mid;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int getThreshold(int[] map, int val) {

        int ans = 0;
        for (int i : map) {
            ans += (i + val - 1) / val;
        }
        return ans;
    }*/

/*Smallest Divisor Satisfying the Limit
Given an integer ( n ), an array of integers nums, and an integer limit, we will choose any positive integer ( d ), divide all the array elements by it, and sum up the value of each division into result. Find the smallest ( d ) such that the result for it is less than or equal to limit.

Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).

Input Format:

The first line contains a single integer ( n ), the size of the nums array.
The second line contains ( n ) space-separated integers denoting the nums array.
The third line contains a single integer limit.
Output Format:

Print a single integer denoting the smallest possible divisor.
Sample Input 1:

4
1 2 5 9
6
Sample Output 1:

5
Explanation:

We can get a sum of 17 (1+2+5+9) if the divisor is 1. If the divisor is 4, we can get a sum of 7 (1+1+2+3), and if the divisor is 5, the sum will be 5 (1+1+1+2).

Sample Input 2:

5
44 22 33 11 1
5
Sample Output 2:

44
Explanation:

We can get a sum of 111 (44+22+33+11+1) if the divisor is 1. If the divisor is 44, the sum will be 5 (1+1+1+1+1).

Constraints:

1 <= n <= 5 * 10^4

1 <= nums[i] <= 10^6

n <= threshold <= 10^6

Note: The function should return the result.*/