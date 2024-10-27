package com.learn.java.stack;

import java.util.Stack;

public class BalanceBrackets {
    public static void main(String[] args) {
        String str = "{{}{{{}{{}}{{";
        System.out.println(countop(str));
    }
    public static int countop(String s) {
        int r = s.length(), openCount = 0, closeCount = 0, res = 0, l=0;
        Stack<Character> stk = new Stack<>();
        if (l < r) {
            if (s.charAt(l) == '{') {
                stk.add('{'); l++;
            }
            if (s.charAt(l) == '}') {
                stk.pop(); l++;
            }
        }
        System.out.println(stk);
        int sz = stk.size();
        for (int i=0; i<sz; i++) {
        }
        return res;
    }
}
