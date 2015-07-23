package edu.sust.test.Composite_Pattern;

/**
 * Created by envy15
 * on 2015/7/23 0023.
 * used by TestJava8_Two
 * 组合模式详解
 * 实现所有类的共同接口(抽象类)的默认行为
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public Component() {
    }

    public abstract void Add(Component component);

    public abstract void Remove(Component component);

    public abstract void Display(int depth);
}
