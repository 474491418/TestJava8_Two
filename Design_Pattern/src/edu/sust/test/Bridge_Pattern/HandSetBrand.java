package edu.sust.test.Bridge_Pattern;

/**
 * Created by envy15
 * on 2015/7/24 0024.
 * used by TestJava8_Two
 * 桥接模式 手机品牌抽象类
 */
public abstract class HandSetBrand {
    protected HandSetSoft handSetSoft;

    //用于两个类的组合
    public  void setHandSetSoft(HandSetSoft handSetSoft){
        this.handSetSoft=handSetSoft;
    };

    public abstract void run();
}
