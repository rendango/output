package org.example;


//A - Edge Checker 2
//
/*
 */

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        if ((a * 2 == b) || ((a * 2 + 1) == b)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}