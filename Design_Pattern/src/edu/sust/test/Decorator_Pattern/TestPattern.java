package edu.sust.test.Decorator_Pattern;

/**
 * Created by envy15 on 2015/7/13 0013.
 * used by TestJava8
 */
public class TestPattern {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("光照");
        System.out.println("第一种装扮：");
        TShirt tShirt = new TShirt();
        Sneakers sneakers = new Sneakers();
        BigPaints bigPaints = new BigPaints();
        Kobe9 kobe9 = new Kobe9();

        bigPaints.decorate(person);
        sneakers.decorate(bigPaints);
        tShirt.decorate(sneakers);
        kobe9.decorate(tShirt);

        kobe9.show();
    }
}
