package edu.sust.test.Decorator_Pattern;

/**
 * Created by envy15 on 2015/7/13 0013.
 * used by TestJava8
 */
public class Clothes extends Person {

    protected Person component;

    public Person getComponent() {
        return component;
    }

    public void setComponent(Person component) {
        this.component = component;
    }

    public void decorate(Person component) {

        component.show();
    }

    @Override
    public void show() {
        if (component != null) {
            super.show();
        }
    }
}
