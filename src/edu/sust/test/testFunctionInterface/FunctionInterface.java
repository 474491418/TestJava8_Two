package edu.sust.test.testFunctionInterface;

/**
 * Created by envy15 on 2015/7/11 0011.
 * used by TestJava8
 * 函数式接口 只有一个方法
 */
@FunctionalInterface
public interface FunctionInterface<F, T> {
    T convert(F from);

}