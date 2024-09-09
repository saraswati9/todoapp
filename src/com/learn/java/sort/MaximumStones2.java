package com.learn.java.sort;

import java.util.LinkedList;

public class MaximumStones2 {
    public static void main(String[] args) {
        int[] piles = {2,7,1,4,9,7,3,6,0,1,3,5,9,1,2};  //{2, 4, 9, 8, 11, 2};
        int sum = maximumPile(piles);
        System.out.println("sum value is: " + sum);
    }// {2,7,1,4,9,7,3,6,0,1,3,5,9,1,2} - 15

    public static int maximumPile(int[] piles) {
        int sum = 0;
        LinkedList<Integer> pList = new LinkedList<>();
        for (int i : piles) {
            pList.add(i);
        }
        System.out.println("pList values are: " + pList);
        return sum;
    }

}
