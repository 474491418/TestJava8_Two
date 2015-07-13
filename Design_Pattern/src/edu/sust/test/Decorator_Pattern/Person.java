package edu.sust.test.Decorator_Pattern;

/**
 * Created by envy15 on 2015/7/13 0013.
 * used by TestJava8
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的:" + name);
    }
}
