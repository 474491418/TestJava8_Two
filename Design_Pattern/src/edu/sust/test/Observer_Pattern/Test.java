package edu.sust.test.Observer_Pattern;

/**
 * Created by envy15
 * on 2015/7/24 0024.
 * used by TestJava8_Two
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss("黄世仁");
        StockObserver stockObserver = new StockObserver();
        NBAObserver nbaObserver = new NBAObserver();
        boss.addObserver(stockObserver);
        boss.addObserver(nbaObserver);
        boss.close(1);
        boss.close(2);
        boss.notifyObservers(boss);
    }
}
