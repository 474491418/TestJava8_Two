package edu.sust.test.Proxy_Pattern;

/**
 * Created by envy15
 * on 2015/7/24 0024.
 * used by TestJava8_Two
 */
public class ProxyPursuit implements IGiveGift {
    public Pursuit pursuit;

    public ProxyPursuit() {
    }

    public ProxyPursuit(SchoolGirl mm) {
        pursuit = new Pursuit(mm);
    }

    @Override
    public void giveGift() {

        pursuit.giveGift();
    }

    @Override
    public void giveDoll() {
        pursuit.giveDoll();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
