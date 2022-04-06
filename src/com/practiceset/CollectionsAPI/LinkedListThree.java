package com.practiceset.CollectionsAPI;

import java.util.LinkedList;
import java.util.List;

// Ques - implementation of linked list using collection framework
//
public class LinkedListThree {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        // Adding the element in the list continuously
        list.add("one");
        list.add("two");
        list.add("four");

        System.out.println("Printing the elements after inserting the elements ");
        list.forEach(System.out::println);

        // Adding the element by index
        list.add(2,"three");
        System.out.println("Updated list ");
        list.forEach(System.out::println);

        // removing the element from the using
        list.remove("one");
        System.out.println("removed element 'one'");
        list.forEach(System.out::println);

        // removing element from the list using index
        list.remove(1);
        // removing the element which is present at index 1
        list.forEach(System.out::println);

        // set the element at index
        list.set(0,"one");
        // set the element 'one' at index 0
        boolean result = false;
        if(list.get(0).equals("one")){
            result = true;
        }
        System.out.println("Is 'one' present at index 0 " +  result);
        list.clear();
        System.out.println("list is cleared now, " +list.size()+" elements present in the list");
    }
}
