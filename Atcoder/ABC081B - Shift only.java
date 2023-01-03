package org.example;


//ABC081B - Shift only
//https://atcoder.jp/contests/abs/tasks/abc081_b
/*
List型に変換後while文で奇数が出現するまでループさせ、そのループ回数を出力した
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String b = scan.nextLine();
        String a = scan.nextLine();
        int count = 0;
        List<Integer> A = Arrays
                .stream(a.split("\\s+"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        while (true) {
            boolean J = judge(A);
            if (J) {
                for (int i = 0; i < A.size(); i++) {
                    int x = A.get(i);
                    A.set(i, x / 2);
                }
                count++;
            } else break;
        }
        System.out.println(count);
    }

    public static boolean judge(List<Integer> list) {
        for (int j = 0; j < list.size(); j++) {
            int y = list.get(j);
            if ((y % 2) != 0) {
                return false;
            }
        }
        return true;
    }
}