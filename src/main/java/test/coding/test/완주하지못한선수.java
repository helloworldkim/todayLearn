package test.coding.test;


import java.util.Arrays;
import java.util.List;


public class 완주하지못한선수 {

    public static void main(String[] args) {
//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"stanko", "ana", "mislav"};
        String[] completion = {"eden", "kiki"};
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = "";
        List<String> participants = Arrays.asList((participant));
        List<String> completions = Arrays.asList(completion);

        for (int i = 0; i < participants.size(); i++) {
            String p = participants.get(i);
            //마지막까지 못찾고 왔다면 마지막 참가자가 완주를 못했다.
            if (i == participants.size()-1) {
                answer = participants.get(i);
                break;
            }
            String c = completions.get(i);
            if(!c.equals(p)){
                answer = participants.get(i);
                break;
            }
        }
        System.out.println("answer = " + answer);



    }
}
