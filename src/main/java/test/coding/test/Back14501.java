package test.coding.test;

import java.util.*;

public class Back14501 {
    static int n;
    static int[] t, p;
    static int max = 0;

    public static void dfs(int day, int sum) {
        // 퇴사일 이후면 종료
        if (day > n) {
            max = Math.max(max, sum);
            return;
        }
        // 상담을 할 수 있는 경우
        if (day + t[day] <= n + 1) {
            // 상담을 하는 경우
            dfs(day + t[day], sum + p[day]);
        }
        // 상담을 하지 않는 경우
        dfs(day + 1, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //퇴사일
        n = sc.nextInt();
        t = new int[n + 1];
        p = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }
        //상담가능 한 모든 경우의 수를 비교해서 가장 높은 수익을 받는걸 계산한다.
        dfs(1, 0);
        System.out.println(max);
    }
}