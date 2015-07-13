package edu.sust.test.testStream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by envy15 on 2015/7/11 0011.
 * used by TestJava8
 */
public class Test {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("peter", "Alex", "Kent", "ddd2", "aaa2", "bbb1", "aaa1", "bbb3", "ccc", "bbb2", "ddd1");
        long a = nameList.stream().filter((str) -> str.startsWith("a")).count();
        nameList.stream().filter((str) -> str.startsWith("a")).forEach(System.out::println);
        System.out.println(a);
        nameList.stream().map(String::toUpperCase).sorted((c, b) -> c.compareTo(b)).forEach(System.out::println);
        nameList.stream().filter((str) -> str.startsWith("a")).count();
    }
}