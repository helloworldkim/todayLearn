package test.coding.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

public class StringTest {

    @Test
    @DisplayName("String 속도 테스트")
    void StringTest() {
        final String value = "abcdef";
        for (int i = 0; i < 10; i++) {
            String a = new String();
            StringBuilder b = new StringBuilder();
            StringBuffer c = new StringBuffer();

            StopWatch timea = new StopWatch("aStopWatch");
            StopWatch timeb = new StopWatch("bStopWatch");
            StopWatch timec = new StopWatch("cStopWatch");

            timea.start();
            for (int j = 0; j < 10000; j++) {
                a += value;
            }
            timea.stop();
            System.out.println(timea.prettyPrint());;

            timeb.start();
            for (int j = 0; j < 10000; j++) {
                b.append(value);
            }
            timeb.stop();
            System.out.println(timeb.prettyPrint());;

            timec.start();
            for (int j = 0; j < 10000; j++) {
                c.append(c);
            }
            timec.stop();
            System.out.println(timec.prettyPrint());;

        }
    }
}
