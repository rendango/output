package org.example;


//A055:脱出ゲーム
//
/*
ランタイムエラー

 */

import java.util.ArrayDeque;
import java.util.Scanner;

class Point {
    private int x;
    private int y;

    Point(int a, int b) {
        x = a;
        y = b;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void setX(int n) {
        x = n;
    }

    void setY(int n) {
        y = n;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = Integer.parseInt(scan.next());
        int W = Integer.parseInt(scan.next());
        char[][] s = new char[H][W];
        char[][] map = new char[H][W];
        Point[] D4 = {new Point(0, -1), new Point(1, 0), new Point(0, 1), new Point(-1, 0)};
        int SH = 0, SW = 0;
        int i = 0;
        while (i < H) {
            String S = scan.next();
            s[i] = S.toCharArray();
            for (int j = 0; j < W; j++) {
                if (s[i][j] == 'S') {
                    SH = i;
                    SW = j;
                }
            }
            i++;
        }
        Point start = new Point(SH, SW);
        ArrayDeque<Point> dq = new ArrayDeque<>();
        dq.add(start);
        s[start.getY()][start.getX()] = '#';

        while (dq.size() > 0) {
            Point p = dq.removeFirst();
            for (int k = 0; k < 4; k++) {
                int x = p.getX() + D4[k].getX();
                int y = p.getY() + D4[k].getY();

                if (s[y][x] == '.') {
                    dq.addLast(new Point(x, y));
                    s[y][x] = '#';
                    if (x == 0 || y == 0 || x == H - 1 || y == W - 1) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
        }
        System.out.println("NO");
        return;
    }
}