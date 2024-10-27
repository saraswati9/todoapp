package com.learn.java.sort;

public class ArrangeTheBallsSWG {
    public static void main(String[] args) {
        //char[] balls = new char[]{'G', 'S', 'S', 'W', 'S', 'G', 'W', 'S'}; //S S S S W W G G
        char[] balls = new char[]{'S','G','W','G','S'};       //{'S','S','G','G','W','W','W','W','W'};       //{'S','G','W','G','S'};
        arrangeTheBalls(balls.length, balls);
    }
    private static void arrangeTheBalls(int n, char[] balls) {
        int l=0, r=balls.length-1, len = balls.length;
        arrangeRecursively(l,r,balls);
        //System.out.println("balls: "+Arrays.toString(balls));
        for (int i=0; i<len; i++) {
            System.out.print(balls[i]+" ");
        }
    }
    static void arrangeRecursively(int l, int r, char[] balls) {
        if (balls[l] == 'S') {
            l++;
            arrangeRecursively(l, r, balls);
        } else if (balls[l] == 'G') {
            swap(l, r, balls);
            l++; r--;
            arrangeRecursively(l, r, balls);
        }
    }
    static void swap(int l, int r, char[] balls) {
        char temp = balls[r];
        balls[r] = balls[l];
        balls[l] = temp;
    }
}
        /*List<Character> list1 = Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
        List<Character> list2 = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        HashMap<Character, Integer> ballsMap = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        Boolean b = false;
        System.out.println("Map values are: "+ballsMap);
        for (int i=0; i<n; i++) {
            Character ch = balls[i];
            if (list1.contains(ch) || list2.contains(ch)) {
                if (ballsMap.containsKey(ch)) {
                    Integer val = ballsMap.get(ch);
                    val++;
                    ballsMap.put(ch, val);
                } else {
                    ballsMap.put(ch, 1);
                }
            } else {
                b = true;
            }
        }
        System.out.println("Map values are: "+ballsMap);
        if (!b) {
            sb.append("S".repeat(Math.max(0, ballsMap.get('S'))));
            sb.append("W".repeat(Math.max(0, ballsMap.get('W'))));
            sb.append("G".repeat(Math.max(0, ballsMap.get('G'))));
            System.out.println("new array values are: " + Arrays.toString(sb.toString().toCharArray()));
        } else {
            System.out.println();
        }*/
