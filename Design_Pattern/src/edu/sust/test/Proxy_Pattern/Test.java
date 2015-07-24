package edu.sust.test.Proxy_Pattern;

/**
 * Created by envy15
 * on 2015/7/24 0024.
 * used by TestJava8_Two
 */
public class Test {
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl("AngelaBaby");
        ProxyPursuit proxyPursuit = new ProxyPursuit(mm);
        proxyPursuit.giveGift();
        proxyPursuit.giveDoll();
        proxyPursuit.giveChocolate();
    }
}
