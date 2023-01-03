package org.example;


//ABC087B - Coins
//https://atcoder.jp/contests/abs/tasks/abc087_b
/*
単純に各コインの0から最大数までの合計を比較・一致したものをカウントした
ただし計算量がN^3であり冗長なので今後減らす方法を考える。
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int A = 500;
        final int B = 100;
        final int C = 50;
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int x = scan.nextInt();
        int count = 0;

        for (int i = 0; i <= c; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= a; k++) {
                    if ((A * k + B * j + C * i) == x) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}