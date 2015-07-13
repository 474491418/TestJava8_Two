package edu.sust.test.formula;

/**
 * Created by envy15 on 2015/7/11 0011.
 * used by TestJava8
 */
public interface Formula {
    public double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}