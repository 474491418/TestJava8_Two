package edu.sust.test.Proxy_Pattern;

/**
 * Created by envy15
 * on 2015/7/24 0024.
 * used by TestJava8_Two
 * 代理模式 追求者 就是被代理类
 */
public class Pursuit implements IGiveGift {
    public SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    public Pursuit() {
    }

    @Override
    public void giveGift() {
        System.out.println(mm.getName() + "送你的礼物");
    }

    @Override
    public void giveDoll() {
        System.out.println(mm.getName() + "送你的洋娃娃");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + "送你的巧克力");
    }
}
