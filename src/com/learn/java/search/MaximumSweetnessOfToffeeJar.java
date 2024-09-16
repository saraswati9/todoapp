package com.learn.java.search;

import java.util.Arrays;
import java.util.HashMap;

public class MaximumSweetnessOfToffeeJar {
    public static void main(String[] args) {
        int count = maximumSweetness(new int[]{13,5,1,8,21,2}, 3);
        System.out.println("max val is: "+count);
    }
    public static int maximumSweetness(int[] price, int k) {
        Arrays.sort(price);
        int low = 0, high = Integer.MAX_VALUE, mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (isPossible(price, k, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
    static boolean isPossible(int[] price, int k, int x) {
        int last = price[0], count = 1, i = 1;
        while ( i < price.length) {
            if (price[i] - last >= x) {
                last = price[i]; count++;
            }
            i++;
            if(count>=k) {
                return true;
            }
        }
        return count >= k;
    }
}

/*Maximum Sweetness of Toffee Jar
You are given an integer ( n ), an array of positive integers price where price[i] denotes the price of the ( i )-th toffee, and a positive integer ( k ).

The store sells jars of ( k ) distinct toffees. The sweetness of a toffee jar is the smallest absolute difference of the prices of any two toffees in the jar.

Return the maximum sweetness of a toffee jar.

Input Format:

The first line contains a single integer ( n ), the size of the price array.
The second line contains the price array, denoting the price of the ( i )-th toffee.
The third line contains a single integer ( k ), denoting the number of distinct toffees in each jar.
Output Format:

Print a single integer denoting the maximum possible sweetness.
Sample Input 1:

6
13 5 1 8 21 2
3
Sample Output 1:

8
Explanation:

Choosing the toffees with the prices [13, 5, 21]. The sweetness of the toffee jar is:
min(|13 - 5|, |13 - 21|, |5 - 21|) = min(8, 8, 16) = 8
It can be proven that 8 is the maximum sweetness that can be achieved.
Sample Input 2:

3
1 3 1
2
Sample Output 2:

2
Explanation::

Choose the toffees with the prices [1, 3]. The sweetness of the toffee jar is:
min(|1 - 3|) = min(2) = 2
It can be proven that 2 is the maximum sweetness that can be achieved.
Constraints:

( 2 <= k <= n <= 10^5 )
( 1 <=price[i] <= 10^9 )
Note: The function should return the result.*/