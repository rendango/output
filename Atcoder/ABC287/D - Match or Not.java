package org.example;


//D - Match or Not
//https://atcoder.jp/contests/abc286/tasks/abc286_b
/*

 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        char[] s = S.toCharArray();
        String T = scan.next();
        char[] t = T.toCharArray();
        char[] st = new char[T.length()];
        for (int i = 0; i <= T.length(); i++) {
            boolean flg = false;
            for (int j = 0; j < T.length(); j++) {
                if (j < i) {
                    st[j] = s[j];
                } else {
                    st[j] = s[S.length() - T.length() + j];
                }
                if (!(st[j] == '?' || t[j] == '?') && !(st[j] == t[j])) {
                    flg = true;
                    break;
                }
            }
            if (flg) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}