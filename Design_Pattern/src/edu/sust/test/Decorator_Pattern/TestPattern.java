package edu.sust.test.Decorator_Pattern;

/**
 * Created by envy15 on 2015/7/13 0013.
 * used by TestJava8
 */
public class TestPattern {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("光照");
        TShirt tShirt = new TShirt();
        Sneakers sneakers = new Sneakers();
        BigPaints bigPaints = new BigPaints();

        bigPaints.decorate(person);
        sneakers.decorate(bigPaints);
        tShirt.decorate(sneakers);
        tShirt.show();
    }
}
