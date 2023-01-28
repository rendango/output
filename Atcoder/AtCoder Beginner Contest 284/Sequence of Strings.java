package org.example;


//	Sequence of Strings
//
/*
※未解決(ACとWJが入り交じる)
3重ループかつ計算量を減らすため提供枚数を超えない制限を設定した
しかし幾つかのケースにおいてWJ判定が出た(単に計算量overによるタイム超過？)
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        int N = Integer.parseInt(n);
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            String s = scan.next();
            S[i] = s;
        }
        int j = 0;
        while (!(j >=N)) {
            System.out.println(S[N - 1 - j]);
            j++;
        }
    }
}