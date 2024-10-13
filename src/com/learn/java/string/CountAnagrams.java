package com.learn.java.string;

import java.util.*;

public class CountAnagrams {
    public static void main(String[] args) {
        int res = countAnagrams("fororfrdofr", "for");
        System.out.println("res value is: " + res);
    }

    public static int countAnagrams(String s, String c) {
        int i=0, j=0, count = 0, sz = s.length(), cSize = c.length();
        HashMap<Character, Integer> map = getCharacterIntegerHashMap(c);
        while(j < sz) {
            boolean flag = false;
            if (j-i+1 < cSize) {
                Character ch = s.charAt(j);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch)-1);
                }
                j++;
            } else if (j-i+1 == cSize) {
                Collection<Integer> values = map.values();
                for (Integer val : values) {
                    if (val < 0) {
                        flag = true;
                    } else if (val > 0) {
                        flag = true;
                    }
                }
                if (!flag) {
                    count++;
                }
                map = getCharacterIntegerHashMap(c);
                i++;
                j++;
            }
        }
        return count;
    }

    private static HashMap<Character, Integer> getCharacterIntegerHashMap(String c) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character ch : c.toCharArray()) {
            int count = 1;
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, count);
            }
        }
        System.out.println("map: "+map);
        return map;
    }

    /*public static int countAnagrams(String s, String c) {
        int cSize = c.length(), count = 0;
        List<Character> charList = new ArrayList<>();
        for(char ch : c.toCharArray()) {
            charList.add(ch);
        }
        for (int i = 0; i < s.length(); i++) {
            boolean flag = checkContains(i, i + cSize, charList, s);
            if (flag) count++;
        }
        return count;
    }*/

    /*public static boolean checkContains(int st, int end, List<Character> list, String str) {
        HashSet<Character> cSet = new HashSet<>();
        for (int i = st; i < end; i++) {
            if (i < str.length()) {
                if (list.contains(str.charAt(i))) {
                    cSet.add(str.charAt(i));
                }
            }
        }
        return cSet.size() == list.size();
    }*/
}
