package com.learn.java.queue;

import java.util.*;

public class QueueInsertion {
    public static void main(String[] args) {
        //List<Integer> nums = Arrays.asList(1,3,6,9,8);
        List<Integer> nums = Arrays.asList(48,108,63,21,27,8,49,21,75,8,24,42,149,18,8,28,21,18,25,35,59,70,59,33,40,1,67,34,120,82,4,115,72,87,3,15,15,63,37,12,40,27,83,14,38,20,14,58,93,10,31,3,39,6,197,77,54,16,31,146,9,49,14,8,77,82,5,11,80,116,8,61,50,24,7,103,29,11,3,3,1,12,46,24,21,131,39,29,36,2,107,40,16,99,31,41,29,48,17,17);
        Queue<Integer> q = enqueue(nums);
        System.out.println(q);
    }
    public static Queue<Integer> enqueue(List<Integer> nums) {
        Queue<Integer> q = new LinkedList<>();
        boolean flag = false;
        int len = nums.size();
        if (len < 1 || len > 100000) {
            flag = true;
        }
        if (!flag) {
            for (int i = 0; i < len; i++) {
                int val = nums.get(i);
                if (val >= 100000) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                for (int i = 0; i < len; i++) {
                    q.add(nums.get(i));
                }
            }
        }
        return q;
    }
}
