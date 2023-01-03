package org.example;


//ABC085B - Kagami Mochi
//https://atcoder.jp/contests/abs/tasks/abc085_b
/*
Listに各円盤の直径を入力後、降順ソートを行った(17~31)
その後中身に対して前の値より小さい(ソートしているので異なる値でも可)場合にカウントを増やす。
カウント中は容易化を図るために単純に前の値と今の値の比較にした
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        List<Integer> A = new ArrayList<Integer>();
        int x = 1;
        while (scan.hasNextInt()) {
            String a = scan.nextLine();
            A.add(Integer.parseInt(a));
            if (x == Integer.parseInt(n)) {
                scan.close();
                break;
            }
            x++;
        }
        Collections.sort(A);
        Collections.reverse(A);
        int count = 1;
        int now = A.get(0);
        for (int s :
                A) {
            if (now > s) {
                count++;
            }
            now = s;
        }
        System.out.println(count);
    }
}