package edu.sust.test.Observer_Pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by envy15
 * on 2015/7/24 0024.
 * used by TestJava8_Two
 */
public class MyObserverList {
}

class StockObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Boss boss = (Boss) arg;
        System.out.println(boss.getName() + "回来了，关闭股票,还有" + boss.getDest() + "步进门");
    }
}

class NBAObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("关闭NBA");
    }
}