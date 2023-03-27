package test.coding.test;

import java.util.Arrays;

public class K번째수 {

    public static void main(String[] args) {

        //입력정보
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        //결과반환배열
        int[] answer = new int[commands.length];

        //commands의 배열숫자만큼 반복
        for(int i=0; i<commands.length; i++){
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int[] ints = Arrays.copyOfRange(array, start, end);
            Arrays.sort(ints);
            answer[i]=ints[commands[i][2]-1];
        }
        System.out.println("answer = " + answer);


    }
}
