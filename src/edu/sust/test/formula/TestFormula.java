package edu.sust.test.formula;

/**
 * Created by envy15 on 2015/7/11 0011.
 * used by TestJava8
 * <p>
 * Formula接口在拥有calculate方法之外同时还定义了sqrt方法，
 * 实现了Formula接口的子类只需要实现一个calculate方法，
 * 默认方法sqrt将在子类上可以直接使用。
 */
public class TestFormula {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a);
            }
        };
        double calculate = formula.calculate(9);
        System.out.println(calculate);
        System.out.println(formula.sqrt(16));
    }
}