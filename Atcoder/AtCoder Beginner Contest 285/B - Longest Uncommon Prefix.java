package org.example;


//B - Longest Uncommon Prefix
//
/*
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        String S = scan.next();
        char[] s = S.toCharArray();
        for (int i = 0; i < N-1; i++) {
            int tmp = MaxJudge(i, s);
            System.out.println(tmp);
        }
    }

    public static int MaxJudge(int a, char[] s) {
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            //下記if文で超過時のエラー回避をしているのでループ回数での制限不要
            if ((i + a + 1) >= s.length) {
                return count;
            } else if (s[i] == s[i + a + 1]) {
                return count;
            } else {
                count++;
            }
        }
        return count;
    }
}