package org.example;


//ABC081A - Placing Marbles
//https://atcoder.jp/contests/abs/tasks/abc081_a
/*
string型で取得し、Listに返還後frequencyメソッドで出現頻度を出力した
<参考>
https://www.techiedelight.com/ja/count-frequency-elements-list-java/
 */
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        List<Integer> b = Arrays
                .stream(a.split(""))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(Collections.frequency(b,1));
    }
}