package com.learn.java.stack;

import java.util.*;

public class TunnelOfWorkers {
    public static void main(String[] args) {
        List<Integer> in = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> out = new ArrayList<>(Arrays.asList(5,3,4,2,1));
        boolean b = calculateTotalTrappedWorkers(in, out);
        if (b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    static boolean calculateTotalTrappedWorkers(List<Integer> in, List<Integer> out) {
        Stack<Integer> stk = new Stack<>();
        int len = in.size();
        boolean b = true;
        for (int i=0; i<len; i++) {
            stk.add(in.get(i));
        }
        for (int j=0; j<len; j++) {
            if (!Objects.equals(stk.pop(), out.get(j))) {
                b = false;
            }
        }
        return b;
    }
}
