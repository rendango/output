package org.example;


//A - Range Swap
//https://atcoder.jp/contests/abc286/tasks/abc286_a
/*

 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int P = Integer.parseInt(scan.next());
        int Q = Integer.parseInt(scan.next());
        int R = Integer.parseInt(scan.next());
        int S = Integer.parseInt(scan.next());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(scan.next());
        }
        for (int i = 0; i < (Q - P + 1); i++) {
            int tmp = A[P -1 + i];
            A[P -1 + i] = A[R -1 + i];
            A[R -1 + i] = tmp;
        }
        for (int i = 0; i < N; i++) {
            if (i==0){
                System.out.printf("%d",A[i]);
            }else {
                System.out.printf(" %d",A[i]);
            }
        }
    }
}