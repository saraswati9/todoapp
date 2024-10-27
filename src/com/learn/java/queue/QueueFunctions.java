package com.learn.java.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueFunctions {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,9,11,3,2);
        int key = 4;
        Queue<Integer> resQ = solve(list, key);
        System.out.println(resQ);
    }
    public static Queue<Integer> solve(List<Integer> v, int k) {
        Queue<Integer> resQ = new LinkedList<>();
        if (k >= 1 && v.size()>=2) {
            for (int i : v) {
                resQ.add(i);
            }
            resQ.remove();
            System.out.println(resQ.peek());
            if (resQ.contains(k)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        return resQ;
    }
}
