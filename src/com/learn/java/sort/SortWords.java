package com.learn.java.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortWords {
    public static void main(String[] args) {
        List<String> inventory1 = Arrays.asList("book", "enchanted", "spell", "wand");
        List<String> inventory2 = Arrays.asList("ancient", "dragon", "magic", "scroll");
        List<String> resList = solve(inventory1, inventory2);
        System.out.println("resList value is: " + resList);
    }

    public static List<String> solve(List<String> inventory1, List<String> inventory2) {
        List<String> stringList = new ArrayList<>();
        int s1 = inventory1.size(), s2 = inventory2.size();
        String[] str1 = new String[s1];
        str1 = inventory1.toArray(str1);
        String[] str2 = new String[s2];
        str2 = inventory2.toArray(str2);

        int i = 0, j = 0, k = 0;
        while (i < s1 && j < s2) {
            if (str1[i].compareTo(str2[j]) >= 0) {
                stringList.add(k, str2[j]); j++;
            } else {
                stringList.add(k, str1[i]); i++;
            }
            k++;
        }
        while (i < s1) {
            stringList.add(k, str1[i]); i++; k++;
        }
        while (j < s2) {
            stringList.add(k, str2[j]); j++; k++;
        }
        return stringList;
    }
}
