package edu.sust.test.Facade_Pattern;

/**
 * Created by envy15
 * on 2015/7/24 0024.
 * used by TestJava8_Two
 * 外观模式 客户端
 */
public class Test {
    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.buyFund();

        fund.sellFund();
    }
}
