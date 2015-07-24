package edu.sust.test.Facade_Pattern;

/**
 * Created by envy15
 * on 2015/7/24 0024.
 * used by TestJava8_Two
 * 外观模式练习 基金类 表示中间层和底层交互 给上层传递结果
 */
public class Fund {
    Stock1 stock1;
    Stock2 stock2;
    Stock3 stock3;
    NationalDebt nationalDebt;
    Realty realty;

    public Fund() {
        stock1 = new Stock1();
        stock2 = new Stock2();
        stock3 = new Stock3();
        nationalDebt = new NationalDebt();
        realty = new Realty();
    }

    public void buyFund() {
        stock1.buy();
        stock2.buy();
        stock3.buy();
        nationalDebt.buy();
        realty.buy();

    }

    public void sellFund() {
        stock1.sell();
        stock2.sell();
        stock3.sell();
        nationalDebt.sell();
        realty.sell();
    }
}
