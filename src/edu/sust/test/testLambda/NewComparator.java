package edu.sust.test.testLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by envy15
 * on 2015/7/11 0011.
 * used by TestJava8
 * scala式的函数接口
 */
public class NewComparator {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("aa1", "zxc1", "bcs5", "ppo7", "peter", "anna", "mike", "xenia");
        Collections.sort(nameList, (a, b) -> a.compareTo(b));
        nameList.stream().forEach(System.out::println);
    }
}