package test.coding.test;

import java.util.HashMap;
import java.util.Map;

public class 위장 {
    public static void main(String[] args) {
        String[][] clothes = {
                {"yellow_hat", "headgear"}
                , {"blue_sunglasses", "eyewear"}
                , {"green_turban", "headgear"}
        };
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String cloth = clothes[i][0];//옷이름
            String type = clothes[i][1];//종류
            if (map.get(type) != null) {
                int count = map.get(type);
                map.put(type,count+1);
            } else {
                map.put(type,1);
            }
        }

        int answer = 1;
        // 전체 경우의 수 를 구하기 위해 계산
        for (String s : map.keySet()) {
            answer *= map.get(s)+1;
        }
        answer = answer - 1;



    }
}
