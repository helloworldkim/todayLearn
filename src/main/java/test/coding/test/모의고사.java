package test.coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {
    public static void main(String[] args) {
        // 수포자들 찍는 패턴
        int[] partten1 = {1, 2, 3, 4, 5};
        int[] partten2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] partten3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] answers = {1, 2, 3, 4, 5};
        int[] correct = new int[3];

        //해당 패턴에 따라서 몇개를 맞췄는지 찾아보고
        //많이 맞는 사람을 찾아서 return한다.(여러명일수 있다.)

        //1번
        for (int i = 0; i < answers.length; i++) {
            if (partten1[i % partten1.length] == answers[i]) {
                correct[0]++;
            }
            if (partten2[i % partten2.length] == answers[i]) {
                correct[1]++;
            }
            if (partten3[i % partten3.length] == answers[i]) {
                correct[2]++;
            }
        }

        int max = Arrays.stream(correct).max().getAsInt();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < correct.length; i++) {
            if (correct[i] == max) {
                result.add(i + 1);
            }
        }

        int[] answer = result.stream().mapToInt(i -> i).toArray();


    }
}
