package org.example;


//ABC085C - Otoshidama
//
/*
※未解決(ACとWJが入り交じる)
3重ループかつ計算量を減らすため提供枚数を超えない制限を設定した
しかし幾つかのケースにおいてWJ判定が出た(単に計算量overによるタイム超過？)
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //"dream""dreamer""erase""eraser"
        String S = scan.next();
        int i = 0;
        while(true) {
            String newline_code_1 = "";
            String judge = "";
            String dreamer = "";
            String eraser = "";
            String base = "";
            try {
                judge = S.substring(i);
                base = S.substring(i, i + 5);
                eraser = S.substring(i, i + 6);
                dreamer = S.substring(i, i + 7);
            } catch (Exception e) {}
            if (judge.equals(newline_code_1)) {
                System.out.println("YES");
                return;
            }

            if (dreamer.equals("dreamer")) {
                if(S.substring(i+7).equals(newline_code_1)){
                    System.out.println("YES");
                    return;
                }
                if ((S.charAt(i + 7) == 'a') || (S.charAt(i + 7) == 'd')) {
                    if (S.substring(i + 5, i + 10).equals("erase")) {
                        //dreamerase
                        i += 6;
                        continue;
                    } else if (S.substring(i + 5, i + 11).equals("eraser")) {
                        //dreameraser
                        i += 6;
                        continue;
                    } else {
                        //dreamerdream or dreamerdreamer
                        i += 7;
                        continue;
                    }
                } else {
                    System.out.println("NO");
                    return;
                }
            } else if (eraser.equals("eraser")) {
                if(S.substring(i+6).equals(newline_code_1)){
                    System.out.println("YES");
                    return;
                }
                if ((S.charAt(i + 6) == 'e') || (S.charAt(i + 6) == 'd')) {
                    i += 6;
                    continue;
                } else {
                    System.out.println("NO");
                    return;
                }
            } else if (base.equals("dream") || base.equals("erase")) {
                if(S.substring(i+5).equals(newline_code_1)){
                    System.out.println("YES");
                    return;
                }
                if ((S.charAt(i + 5) == 'e') || S.charAt(i + 5) == 'd') {
                    i += 5;
                    continue;
                } else {
                    System.out.println("NO");
                    return;
                }
            } else {
                System.out.println("NO");
                return;
            }
        }
    }
}