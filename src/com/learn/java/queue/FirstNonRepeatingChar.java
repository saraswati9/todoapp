package com.learn.java.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "dabc";
        String res = firstNonRep(str);
        System.out.println(res);
    }
    public static String firstNonRep(String str) {
        int len = str.length();
        String res = "";
        for (int i=0; i<len; i++) {
            Queue<Character> q = new LinkedList<>();
            for (int j=0; j<=i; j++) {
                q.add(str.charAt(j));
            }
            System.out.println(q);
            //res = res.concat(formString(q));
        }
        return res;
    }
    /*static String formString(Queue<Character> queue) {
        if ()
    }*/
}
