package edu.sust.test.Facade_Pattern;

/**
 * Created by envy15
 * on 2015/7/24 0024.
 * used by TestJava8_Two
 * 外观模式练习 股票类 表示最底层的实现 由中间层操作 和 client无关
 */
public class Stock {

}

class Stock1 {
    public void buy() {
        System.out.println("股票1买入");
    }

    public void sell() {
        System.out.println("股票1 卖出");
    }
}

class Stock2 {
    public void buy() {
        System.out.println("股票2买入");
    }

    public void sell() {
        System.out.println("股票2 卖出");
    }
}

class Stock3 {
    public void buy() {
        System.out.println("股票3买入");
    }

    public void sell() {
        System.out.println("股票3 卖出");
    }
}

class NationalDebt {
    public void buy() {
        System.out.println("国债买入");
    }

    public void sell() {
        System.out.println("国债 卖出");
    }
}

class Realty {
    public void buy() {
        System.out.println("房地产买入");
    }

    public void sell() {
        System.out.println("房地产 卖出");
    }
}