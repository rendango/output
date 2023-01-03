package org.example;


//ABC085C - Otoshidama
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
        final int paper1 = 1000;
        final int paper2 = 5000;
        final int paper3 = 10000;
        int n = scan.nextInt();
        int y = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            //iは1000円札の枚数
            for (int j = 0; j <= (n - i); j++) {
                //jは5000円札の枚数(上位の1000円札の枚数との合計がnを超えないように)
                for (int k = 0; k <= (n - i - j); k++) {
                    //kは10000円札の枚数(枚数は同様)
                    int sum = paper1 * i + paper2 * j + paper3 * k; //合計金額
                    if (y == sum) {
                        System.out.println(k + " " + j + " " + i);
                        return;
                    }
                }
            }
        }
        int z = -1;
        System.out.println(z + " " + z + " " + z);
    }
}