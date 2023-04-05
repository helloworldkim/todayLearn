package test.coding.mytest.main;

import lombok.extern.slf4j.Slf4j;
import test.coding.mytest.entity.Person;

@Slf4j
public class HashAndEqualsTest {

    public static void main(String[] args) {

        Person a = new Person("홍길동", 10);
        Person b = new Person("홍길동", 10);

        log.info("a == b = {}", a == b);
        log.info("a.hashCode = {}", a.hashCode());
        log.info("b.hashCode = {}", b.hashCode());
        log.info("b.eqauls(a) = {}", b.equals(a));


        Person c = new Person("홍길동", 10);
        Person d = new Person("동길홍", 10);


        log.info("c == d = {}", c == d);
        log.info("c.hashCode = {}", c.hashCode());
        log.info("d.hashCode = {}", d.hashCode());
        log.info("c.eqauls(d) = {}", c.equals(d));

        String name1 = "홍길동";
        String name2 = new String("홍길동");
        log.info("name1.hashCode = {}", name1.hashCode());
        log.info("name2.hashCode = {}", name2.hashCode());
    }


}
