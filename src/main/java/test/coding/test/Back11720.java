package test.coding.test;

import java.util.*;

public class Back11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //숫자갯수
        int n = sc.nextInt();
        //숫자
        String sNums = sc.next();
        char[] chars = sNums.toCharArray();
        Long answer = 0L;
        for (char aChar : chars) {
            String s = String.valueOf(aChar);
            answer += Long.valueOf(s);
        }
        System.out.print(answer);
    }
}
