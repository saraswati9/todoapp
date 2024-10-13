package com.learn.java.string;

import java.util.ArrayList;
import java.util.List;

public class FindTheIndicesOfAChar {
    public static void main(String[] args) {
        String text = "ababcabab";
        List<Integer> tList = findPatternIndices(text, "ab");
        System.out.println("tList: "+tList);
    }
    public static List<Integer> findPatternIndices(String text, String pattern) {
        List<Integer> indexList = new ArrayList<>();
        int sLen = text.length();
        int pLen = pattern.length();
        for(int i=0; i<sLen; i++) {
            String sub = "";
            if (pLen <= sLen) {
                sub = text.substring(i, pLen);
                pLen++;
                if (sub.equals(pattern)) {
                    indexList.add(i);
                }
            }
        }
        return indexList;
    }
}
