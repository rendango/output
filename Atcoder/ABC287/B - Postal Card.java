package org.example;


//B - Postal Card
//https://atcoder.jp/contests/abc286/tasks/abc286_b
/*

 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int M = Integer.parseInt(scan.next());
        String[] S = new String[N];
        String[] T = new String[M];
        for (int i = 0; i < N; i++) {
            S[i] = scan.next();
            S[i] = S[i].substring(3, 6);
        }
        for (int i = 0; i < M; i++) {
            T[i] = scan.next();
            for (int j = 0; j < i; j++) {
                if (T[i].equals(T[j])) {
                    T[i] = "0";
                    break;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (S[i].equals(T[j])) {
                    count++;
                    S[i] = "1";
                }
            }
        }
        System.out.println(count);
    }
}