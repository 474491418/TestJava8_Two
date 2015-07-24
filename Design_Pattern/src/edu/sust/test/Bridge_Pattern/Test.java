package edu.sust.test.Bridge_Pattern;

/**
 * Created by envy15
 * on 2015/7/24 0024.
 * used by TestJava8_Two
 */
public class Test {
    public static void main(String[] args) {
        HandSetBrand handSetBrandX = new HandSetBrandX();
        handSetBrandX.setHandSetSoft(new HandSetGame());
        handSetBrandX.run();
        handSetBrandX.setHandSetSoft(new HandSetNameList());
        handSetBrandX.run();
        HandSetBrand handSetBrandY = new HandSetBrandY();
        handSetBrandY.setHandSetSoft(new HandSetGame());
        handSetBrandY.run();
        handSetBrandY.setHandSetSoft(new HandSetNameList());
        handSetBrandY.run();
    }
}
