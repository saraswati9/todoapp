package com.learn.java.search;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int res = search(new int[]{4,5,6,7,0,1,2}, 0);
        System.out.println("res is: "+res);
    }
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}

/*Search in Rotated Sorted Array
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index ( k ) (1 ≤ ( k ) < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with ( O(log n) ) runtime complexity.

Input Format:

The first line consists of two integers ( n ) (size of the array) and target.
The second line consists of ( n ) integers (elements of the array).
Output Format:

Print a single integer output. The index of the target if present, otherwise print -1.
Sample Input 1:

7 0
4 5 6 7 0 1 2
Sample Output 1:

4
Explanation:

The array [4,5,6,7,0,1,2] is rotated at pivot index 3. The target 0 is found at index 4.

Constraints:

1 <= nums.length <= 5000
-10^4 <= nums[i] <= 10^4
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-10^4 <= target <= 10^4
Note: The function should return the result.*/
