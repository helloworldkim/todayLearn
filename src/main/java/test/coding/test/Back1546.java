package test.coding.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Back1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //입력받을갯수
        int n = sc.nextInt();
        //대상 값
        List<Integer> list = new ArrayList<>();
        //배열에 넣기
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        int max = list.stream().mapToInt(value -> value).max().getAsInt();
        int originSum = list.stream().mapToInt(value -> value).sum();

        System.out.println(originSum * 100.0 / max / n);

    }
}
