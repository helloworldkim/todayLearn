package test.coding.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringTest {
    public static void main(String[] args) {
        String value = "abcdef";

        String a = "";
        a += value;
        a += value;
        a += value;
        a += value;
        a += value;
        a += value;

    }
}
