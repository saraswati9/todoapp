package com.learn.java.list;

import java.util.ArrayList;
import java.util.Objects;

public class FirstNegativeInteger {
    public static void main(String[] args) {
        //int[] intArr = {12,-1,-7,8,-15,30,16,28};
        int[] intArr = {8,3,12,-1,-7,8,-15,30,16,28};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int integer : intArr) {
            arr.add(integer);
        }
        printFirstNegativeInteger(arr);
    }
    static void printFirstNegativeInteger(ArrayList<Integer> arr) {
        int i = 0, j = 0;
        int size = arr.size();
        ArrayList<Integer> list = new ArrayList<>();
        while (j < size) {
            if (arr.get(j) < 0) {
                list.add(arr.get(j));
            }
            if (j - i + 1 < 3) {
                j++;
            } else if (j - i + 1 == 3) {
                if (!list.isEmpty()) {
                    System.out.println(list.getFirst());
                    if (Objects.equals(arr.get(i), list.getFirst())) {
                        list.removeFirst();
                    }
                } else {
                    System.out.println(0);
                }
                i++;
                j++;
            }
        }
    }
    /*static void findFirst(int st, int end, ArrayList<Integer> list) {

    }*/

        /*for (int i=0; i<arr.size()-k; i++) {
            for (int j=i; j<k; j++) {
                if (arr.get(j) < 0) {
                    System.out.println(arr.get(j));
                    break;
                }
            }
        }
    }*/
}
