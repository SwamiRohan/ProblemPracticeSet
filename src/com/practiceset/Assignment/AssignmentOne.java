package com.practiceset.Assignment;

// Ques - write a program and implement comparable and comparator concept in it.
// Explanation - sorting name in reverse alphabetic order and id in ascending order using comparable and comparator

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Person implements Comparable<Person>{
    private String name;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int compare = name.compareTo(o.name);
        if(compare == 0){
            return o.id.compareTo(id);
        }
        return compare;
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
        Scanner sc = new Scanner(System.in);
        name.add(new Person("ABC",12));
        name.add(new Person("XYZ",22));
        name.add(new Person("XYZ",24));
        name.add(new Person("XYZ",9));
        name.add(new Person("PQR",90));
        name.add(new Person("ABC",90));

        System.out.println("Names after using comparable ");
        name.forEach(System.out::println);

        System.out.println("Names after using comparator and sorting the name in reverse order");
        name.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        Collections.sort(name,new PersonNameReverseSort());
        name.forEach(System.out::println);
    }
}

