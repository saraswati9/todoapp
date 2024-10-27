package com.learn.java.java8.strings;

import java.util.HashSet;
import java.util.Set;

public class UniquePermutationsOfChars {
    public static void main(String[] args) {
        String str = "abed";
        solve(str);
    }
    public static void solve(String s) {
        Set<String> set = new HashSet<>();
        int l=0, r=s.length()-1, mid = s.length()/2;
        permutations(l,r,s,set);
        permutations(mid+1,r,s,set);
    }
    private static void permutations(int l, int r, String s, Set<String> set) {

    }

}
