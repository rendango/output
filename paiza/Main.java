package org.example;


//A052:階段登り
//
/*
 */

import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        char[] unit = (s + t).toCharArray();
        int[] unitInt = new int[unit.length];
        for (int i = 0; i < unit.length; i++) {
            unitInt[i]= (int) (unit[i]-'a'+1);
        }
        for (int i = 0; i < unit.length; i++) {
            int j;
            int tmp ;
            for (j = 0; j < unit.length - i-1; j++) {
                tmp = unitInt[j] + unitInt[j + 1];
                if (tmp > 101) {
                    tmp -= 101;
                }
                unitInt[j]= tmp;
            }
        }
        System.out.println(unitInt[0]);
    }
}