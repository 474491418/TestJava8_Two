package edu.sust.test.Proxy_Pattern;

/**
 * Created by envy15
 * on 2015/7/24 0024.
 * used by TestJava8_Two
 * 被追求者
 */
public class SchoolGirl {
    private String name;

    public SchoolGirl() {
    }

    public SchoolGirl(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
