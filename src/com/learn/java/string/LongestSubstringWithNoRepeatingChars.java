package com.learn.java.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithNoRepeatingChars {
    public static void main(String[] args) {
        String str = "Heycoachsuper30";
        int res = longestUniqueSubsttr(str);
        System.out.println("res is: "+res);
    }
    static int longestUniqueSubsttr(String str) {
        int n = str.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (!charSet.contains(str.charAt(right))) {
                charSet.add(str.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(str.charAt(right))) {
                    charSet.remove(str.charAt(left));
                    left++;
                }
                charSet.add(str.charAt(right));
            }
        }
        return maxLength;
    }
    /*public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> count = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            count.put(c, count.getOrDefault(c, 0) + 1);
            while (count.get(c) > 1) {
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }*/
}
