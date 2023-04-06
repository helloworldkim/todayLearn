package test.coding.mytest.main;

public class WrapperCompareTest {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        intTest(a, b);

        Integer c = 1;
        Integer d = 1;
        IntegerTest(c, d);

        Integer e = 128;
        Integer f = 128;
        IntegerTest(e, f);

    }

    private static void intTest(int a, int b) {
        System.out.println("intTest");

        if (a == b) {
            System.out.println("a==b");
            System.out.println(true);
        } else {
            System.out.println("a==b");
            System.out.println(false);
        }
    }

    private static void IntegerTest(Integer a, Integer b) {
        System.out.println("IntegerTest");

        if (a == b) {
            System.out.println("a==b");
            System.out.println(true);
        } else {
            System.out.println("a==b");
            System.out.println(false);
        }
    }
}
