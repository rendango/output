package org.example;


//ABC083B - Some Sums
//https://atcoder.jp/contests/abs/tasks/abc083_b
/*
1~Nに対して再帰関数(culc)を用いて合計を算出し返り値とした。
main側でその値が範囲内であるか判定し該当するものに関してはその時の値を合算させていった
反省すべきはwhileを使えばここまで複雑にする必要はなかったこと
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            sum = culc(i, sum);
            if (a <= sum && sum <= b) {
                count += i;
            }
        }
        System.out.println(count);
    }

    public static int culc(int x, int y) {
        y += x % 10;
        if (x > 9) {
            x /= 10;
            y = culc(x, y);
        } else {
            return y;
        }
        return y;
    }
}