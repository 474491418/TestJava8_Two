package edu.sust.test.someInterface;

import java.util.function.Function;

/**
 * Created by envy15 on 2015/7/11 0011.
 * used by TestJava8
 */
public class TestFunction {
    public static void main(String[] args) {
        Function<String, Integer> function = Integer::valueOf;
        Function<String, String> function1 = function.andThen((str) -> str + "4");
        Function<String, String> function3 = (str) -> str + "5";
        Function<String, String> function2 = function1.compose(function3);
        System.out.println(function instanceof Function);
        System.out.println(function2.apply("123"));
    }
}