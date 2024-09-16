package com.learn.java.list;

import java.util.Arrays;
import java.util.List;

public class MoveTwosToEndOfList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,5,6);    //2,4,2,3,2,2,2);//2,4,2,3,2,1,5 - 2,2,1
        moveTwos(nums);
    }
    public static void moveTwos(List<Integer> nums) {
        int siz = nums.size();
        int lastIndex = siz-1;
        for(int i=0; i<siz && lastIndex>=0; i++) {
            if (nums.get(i) == 2) {
                while (nums.get(lastIndex) == 2) {
                    lastIndex--;
                }
                if (lastIndex > i) {
                    int temp = nums.get(lastIndex);
                    nums.set(lastIndex, nums.get(i));
                    nums.set(i, temp);
                    lastIndex--;
                }
            }
        }
        System.out.println("nums: "+nums);
    }
}
