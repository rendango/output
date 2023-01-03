package org.example;


//ABC088B - Card Game for Two
//https://atcoder.jp/contests/abs/tasks/abc088_b
/*
　各カードの内容に関して大きい順から取っていくと解釈し降順ソートを疑似的に行った(昇順ソート→逆順)
　その後Aliceは奇数回目(ただしindexの関係上-1するため偶数回)、Bobは偶数回目(同様に奇数回目)に取ることから判定させ
各プレイヤーの獲得点数を算出・比較を行った。
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        String a = scan.nextLine();
        int Acount = 0;
        int Bcount = 0;
        List<Integer> A = Arrays
                .stream(a.split("\\s+"))
                .map(Integer::valueOf)
                .sorted()
                .collect(Collectors.toList());
        Collections.reverse(A);
        for (int i = 0; i < Integer.parseInt(n); i++) {
            if (i % 2 == 0) Acount += A.get(i);
            else Bcount += A.get(i);
        }
        System.out.println(Acount - Bcount);
    }
}