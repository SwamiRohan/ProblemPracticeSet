package com.practiceset.CollectionsAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Ques - Sorting arrayList using comparable

class Employee implements Comparable<Employee> {
    private String name;

    public Employee(String name) {
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
        return "Employee :" +
                "name - '" + name + '\'';
    }

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.name);
    }
}
public class ArrayListFour {
    public static void main(String[] args) {
        var emp = new ArrayList<Employee>();
        emp.add(new Employee("ABC"));
        emp.add(new Employee("PQR"));
        emp.add(new Employee("DEF"));

        Collections.sort(emp);
        emp.forEach(System.out::println);
    }
}
