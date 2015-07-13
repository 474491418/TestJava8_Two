package edu.sust.test.testFunctionInterface.useMoreInPersonClass;

/**
 * Created by envy15 on 2015/7/11 0011.
 * used by TestJava8
 */
public class Person {
    String firstName;
    String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}