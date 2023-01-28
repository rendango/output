package org.example;


//D - Happy New Year 2023
//https://atcoder.jp/contests/abc284/tasks/abc284_d
/*
合成数は√N以下の約数のみ持つという性質がある。
ただし、O(√N)では今回の計算時間に間に合わない。
そこで、今回の問題の条件はp*p*qであるため、3√N以下の約分を持つことを利用する。
pとqの組み合わせは1つのみという前提のため、Nを割り切れる数字が必ず関係する。
そこで、最初に見つけた数字がpなのかqなのかを判別させることで解決できる
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        long p = 0;
        long q = 0;
        for (int i = 0; i < T; i++) {
            long N = scan.nextLong();
            for (long j = 2; j * j * j <= N; j ++) {//ここを3スタート・+=2にしないこと(2も素数)
                if (N % j != 0) continue;
                if (((N / j) % j) == 0) {
                    p = j;
                    q = N / j / j;
                    System.out.println(p + " " + q);
                    break;
                } else {
                    q = j;
                    p = (long) Math.sqrt(N / j);
                    System.out.println(p + " " + q);
                    break;
                }
            }
        }
    }
}