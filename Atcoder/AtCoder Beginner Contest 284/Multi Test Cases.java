package org.example;


//B - Multi Test Cases
//https://atcoder.jp/contests/abc284/tasks/abc284_b
/*
複数のテストケースを1つの入力ファイルで実行するもの
内容自体はテストケース内の奇数の数をカウントするものであり、それを最初に与えられるテストケース数でfor文で回すのみ
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scan.nextInt();
            int[] a = new int[N];
            int count = 0;
            for (int j = 0; j < N; j++) {
                a[j] = scan.nextInt();
                if (a[j] % 2 == 1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}