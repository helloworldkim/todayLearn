package test.coding.test;

import java.util.Arrays;
import java.util.Scanner;

public class Back1940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //재료의 갯수
        int N = sc.nextInt();
        //갑옷을 만드는데 필요한 수
        int M = sc.nextInt();

        int[] arr = new int[N];
        //재료 수 만큼 배열 (고유한 번호)
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        //고유한 숫자이기 때문에 오름차순으로 정렬한다.
        Arrays.sort(arr);

        //투포인터 셋팅
        int left = 0;
        int right = arr.length-1;

        //포인터 이동 조건
        // 2개를 합한게 M보다 작은경우
        // left++;
        // 2개를 합한게 M보다 큰경우
        // right--;
        //각각의 값을 더해서 M이 된 경우 2개의 값 모두 사용하기 때문에 각각 포인터 이동 및 count ++처리
        // left++, right--, count++;
        int count = 0;
        while (left < right) {
            if (arr[left] + arr[right] < M) {
                left++;
            } else if (arr[left] + arr[right] > M) {
                right--;
            } else {
                //동일한 경우
                left++;
                right--;
                count++;
            }
        }

        System.out.println(count);








    }
}
