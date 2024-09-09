package com.learn.java.sort;

public class BubbleSortEx {
    public static void main(String[] args) {
        int[] anish = {991,592,628,960,987,277,307,681,791,535};       //{7,2,8,9,5};
        int[] binish = {736,64,197,375,228,616,105,3,415,633};      //{4,6,2,5,3};
        String res = findWinner(anish, binish);
        System.out.println("Res value is: "+res);
    }
    public static String findWinner(int[] anish, int[] binish) {
        int aLen = anish.length;
        int aCount = 0;
        for (int i=0; i<aLen; i++) {
            for (int j=1; j<aLen-1; j++) {
                if (anish[j-1]>anish[j]) {
                    int temp = anish[j-1];
                    anish[j-1] = anish[j];
                    anish[j]=temp;
                    aCount++;
                }
            }
        }
        int bLen = binish.length;
        int bCount = 0;
        for (int i=0; i<bLen; i++) {
            for (int j=1; j<bLen-1; j++) {
                if (binish[j-1]>binish[j]) {
                    int temp = binish[j-1];
                    binish[j-1] = binish[j];
                    binish[j]=temp;
                    bCount++;
                }
            }
        }
        String res = "";
        if (aCount<bCount) {
            res = "Anish";
        } else if (aCount>bCount) {
            res = "Binish";
        } else {
            res = "Tie";
        }
        return res;
    }
}
