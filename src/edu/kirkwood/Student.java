package edu.kirkwood;

public class Student extends Person {

    public Student(String firstName, String lastName) {
        super(firstName, lastName, PersonType.STUDENT);
    }

    @Override
    public String greet() {
        return "Good morning " + this.firstName;
    }

}

