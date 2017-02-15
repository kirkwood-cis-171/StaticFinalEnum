package edu.kirkwood;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Person bryant = new Person("Bryant", "C");
        Person bruno = new Person("Bruno","R");
        Person andrew = new Person("Andrew","Rompot");
        Teacher chris = new Teacher("Chris","O");
        Person jon = new Person("Jon","W",Person.PersonType.ADMIN);

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(bryant);
        people.add(bruno);
        people.add(andrew);
        people.add(chris);
        people.add(jon);

        for(Person s : people) {
            System.out.println(s.greet());
        }

    }
}

