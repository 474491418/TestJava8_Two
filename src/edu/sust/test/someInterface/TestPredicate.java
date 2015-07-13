package edu.sust.test.someInterface;

import java.util.function.Predicate;


/**
 * Created by envy15 on 2015/7/11 0011.
 * used by TestJava8
 * 记住是这个包下面的java.util.function.Predicate
 * 记住这个借口只能返回boolean形式
 */
public class TestPredicate {
    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> s.length() > 0;
        Predicate<String> predicate1 = (str) -> str.isEmpty();
        System.out.println(predicate.test("test"));
        System.out.println(predicate.negate().test("test"));

    }
}