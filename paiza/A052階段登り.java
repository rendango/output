package org.example;


//A052:階段登り
//
/*
 */

import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int A = Integer.parseInt(scan.next());
        int B = Integer.parseInt(scan.next());
        int[] stairs = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            if (i == 0 || i == N) {
                stairs[i] = 1;
                continue;
            }
            stairs[i] = 0;
        }
        for (int i = 0; i < N; i++) {
            if (stairs[i] == 1) {
                int now = i;
                stairs = check(stairs, now, A, B);
            }
        }
        int count = N + 1;
        for (int c :
                stairs) {
            if (c == 1) {
                count--;
            }
        }
        System.out.println(count);
    }

    public static int[] check(int[] a, int n, int A, int B) {
        if ((n + A) < a.length) {
            a[n + A] = 1;
        }
        if ((n + B) < a.length) {
            a[n + B] = 1;
        }
        return a;
    }
}