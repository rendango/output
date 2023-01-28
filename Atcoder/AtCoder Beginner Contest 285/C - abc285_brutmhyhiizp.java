package org.example;


//C - abc285_brutmhyhiizp
//https://atcoder.jp/contests/abc285/tasks/abc285_c
/*
公式解答からJava用に修正をかけた
https://atcoder.jp/contests/abc285/editorial/5529
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        char[] s = S.toCharArray();
        int j = 1;
        long tmp = 26;
        long count = 0;
        for (int i = 0; i < s.length-1; i++) {
            count += tmp;
            tmp *= 26;
        }
        long num=0;
        for (int i = 0; i < s.length; i++) {
            num*= 26;
            num += (int) (s[i] - 'A');
        }
        System.out.println(count+num+1);
    }
}