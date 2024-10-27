package com.learn.java.arrays;

import java.util.Arrays;

public class JetFighterCaptainAttackWait {
    public static void main(String[] args) {
        int[] a = {0,2,1,3};//{0,1,2,0};//{0,1,0};
        int k = 2; //3
        solve(a, a.length, k);
    }
    static void solve(int a[], int n, int k) {
        boolean flag = false;
        if (n>=3 && k>=2 && k<=n && n<=10000) {
            if (n%k == 0) {
                for (int i=0; i<n; i++) {
                    if (a[i] > 1) {
                        Arrays.sort(a);
                    }
                }
                for (int i=0; i<n; i++) {
                    if (a[i] >= 0 && i+1<n && a[i+1] >= 0) {
                        if (a[i + 1] - a[i] == 1 || a[i + 1] - a[i] == -1) {
                            flag = true;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
            }
        }
        if (flag) {
            System.out.println("Attack");
        } else {
            System.out.println("Wait");
        }
    }
}
