package org.example;


//A - Majority
//https://atcoder.jp/contests/abc286/tasks/abc286_b
/*

 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int count = 0;
        for (int i = 0; i < N; i++) {
            String s = scan.next();
            if (s.equals("For")){
                count++;
            }
        }
        if (count>N/2) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}