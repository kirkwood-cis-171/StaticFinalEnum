package edu.kirkwood;

/**
 * Created by k0808273 on 2/13/2017.
 */
public class Teacher extends Person {


    public Teacher(String firstName, String lastName) {
        super(firstName, lastName, PersonType.TEACHER);
    }

    @Override
    public String greet() {
        return "I AM OVERRIDDEN METHOD";
    }

}
