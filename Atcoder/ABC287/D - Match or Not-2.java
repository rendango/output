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
            for (int j = 0; j < T.length() / 2 ; j++) {
                if (j < i) {
                    st[j] = s[j];
                } else {
                    st[j] = s[S.length() - T.length() + j];
                }
                if ((S.length() - T.length() + i) <= (T.length() - 1 - j)) {
                    st[T.length() - j - 1] = s[S.length() - j - 1];
                } else {
                    st[T.length() - j - 1] = s[T.length() - j - 1];
                }


                if (!(st[j] == '?' || t[j] == '?') && !(st[j] == t[j])) {
                    flg = true;
                    break;
                }
                if (!(st[T.length() - j - 1] == '?' || t[T.length() - j - 1] == '?') && !(st[T.length() - j - 1] == t[T.length() - j - 1])) {
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