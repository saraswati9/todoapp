package com.learn.java.queue;

import java.util.*;

public class ReverseElementsOfQueue {
    public static void main(String[] args) {
        Queue<Integer> iQ = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        int key = 3;
        Queue<Integer> resQ = solve(iQ, key);
        System.out.println(resQ);
    }
    public static Queue<Integer> solve(Queue<Integer> q, int k) {
        Queue<Integer> resQ = new LinkedList<>();
        List<Integer> list = new ArrayList<>(q);
        int len = q.size(), count = 0;
        for (int i=k-1; i>=0; i--) {
            resQ.add(list.get(i));
            count++;
        }
        for (int i=count; i<len; i++) {
            resQ.add(list.get(i));
        }
        return resQ;
    }
}
