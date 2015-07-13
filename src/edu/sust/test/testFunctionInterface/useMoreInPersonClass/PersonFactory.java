package edu.sust.test.testFunctionInterface.useMoreInPersonClass;

/**
 * Created by envy15 on 2015/7/11 0011.
 * used by TestJava8
 */
@FunctionalInterface
public interface PersonFactory<P extends Person> {
    P createPerson(String firstName, String lastName);
}