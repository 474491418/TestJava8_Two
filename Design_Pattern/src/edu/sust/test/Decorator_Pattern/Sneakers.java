package edu.sust.test.Decorator_Pattern;

/**
 * Created by envy15 on 2015/7/13 0013.
 * used by TestJava8
 */
public class Sneakers extends Clothes {
    @Override
    public void show() {
        System.out.println("破球鞋");
        super.show();
    }
}
