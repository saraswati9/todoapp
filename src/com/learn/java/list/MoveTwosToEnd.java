package com.learn.java.list;

import java.util.Arrays;
import java.util.List;

public class MoveTwosToEnd {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,4,2,3,2,2,2);    //2,4,2,3,2,2,2);//2,4,2,3,2,1,5 - 2,2,1
        moveTwos(nums);
    }
    public static void moveTwos(List<Integer> nums) {
        int a = 0;
        for (int i=0; i<nums.size(); i++) {
            if (nums.get(i) != 2) {
                nums.set(a, nums.get(i));
                a++;
            }
        }
        for (int i=a; i<nums.size(); i++) {
            nums.set(i, 2);
        }
        System.out.println("nums is: "+nums);
    }
}
