package edu.sust.test.testFunctionInterface.useMoreInPersonClass;

/**
 * Created by envy15 on 2015/7/11 0011.
 * used by TestJava8
 */
public class TestPerson {
    public static void main(String[] args) {
        PersonFactory<Person> p = Person::new;
        Person person = p.createPerson("Alex", "Kent");
        System.out.println(person.getFirstName() + "-" + person.getLastName());
    }
}