package test.coding.test;

import java.util.Scanner;

// 구간 합 구하기 4
public class Back11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //입력받을갯수
        int N = sc.nextInt();
        //답변 수
        int M = sc.nextInt();

        Long[] sumArray = new Long[N+1];
        //sum 값 초기화
        Long sum = 0L;
        //맨 처음은 0으로 셋팅
        sumArray[0] = sum;
        //N번 반복
        for (int i = 1; i <= N; i++) {
            sum += (long) sc.nextInt();
            sumArray[i] =  sum;
        }

        //답변
        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(sumArray[end] - sumArray[start-1]);
        }
    }
}
