package com.practiceset.Assignment;

// Ques - write a program and implement comparable and comparator concept in it.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person implements Comparable<Person>{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person :" +
                "name '" + name + '\'';
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
}
class PersonNameReverseSort implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
public class AssignmentOne {
    public static void main(String[] args) {
        var name = new ArrayList<Person>();
        name.add(new Person("ABC"));
        name.add(new Person("XYZ"));
        name.add(new Person("PQR"));

        System.out.println("Names after using comparable ");
        name.forEach(System.out::println);

        System.out.println("Names after using comparator and sorting the name in reverse order");
        Collections.sort(name,new PersonNameReverseSort());
        name.forEach(System.out::println);
    }
}

