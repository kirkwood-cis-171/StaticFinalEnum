package edu.kirkwood;

public class Person {

    public enum PersonType {
        ADMIN,
        TEACHER,
        STUDENT,
    }

    public static final int ADMIN = 0;

    protected String firstName;
    protected String lastName;

    private PersonType personType = PersonType.STUDENT;

    //0 - student
    //1 - teacher
    //2 - admin
    //3 -

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, PersonType personType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personType = personType;
    }



    public String greet() {
        if (personType == PersonType.ADMIN ) {
            return "Pleasure to meet you Mrs. " + this.lastName;
        } if( personType == PersonType.TEACHER ) {
            return "Good Morngin Mr. " + this.lastName;
        } else {
            return "Hello " + this.firstName;
        }
    }

    public String greetS() {
        switch (personType) {
            case ADMIN:
                return "Pleasure to meet you Mrs. " + this.lastName;
            case TEACHER:
                return "Good Morngin Mr. " + this.lastName;
            case STUDENT:
                return "Hello " + this.firstName;

        }

        return "?????";
    }


}
