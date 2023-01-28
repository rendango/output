package org.example;


//B - Cat
//https://atcoder.jp/contests/abc286/tasks/abc286_b
/*

 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        String s = scan.next();
        char[] c = s.toCharArray();
        char tmp = 'f';
        for (int i = 0; i < N; i++) {
            if (c[i] == 'a' && tmp == 'n') {
                System.out.printf("y");
            }
            System.out.printf("%c", c[i]);
            tmp = c[i];
        }

    }
}