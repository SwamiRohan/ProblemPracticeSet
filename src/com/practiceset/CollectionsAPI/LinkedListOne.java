package com.practiceset.CollectionsAPI;

// Ques - Basic Operations of linked list Like insertion, sorting, size, printing the element, removing the element

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListOne {
    public static void main(String[] args) {
        var listCityName = new LinkedList<String>();
        listCityName.add("New Delhi");
        listCityName.add("Chandigarh");
        listCityName.add("Dubai");
        listCityName.add("Jammu");

        listCityName.forEach(System.out::println);
        System.out.println("Total elements in the list  "+listCityName.size());
        Collections.sort(listCityName);
        System.out.println("List after sorting");
        listCityName.forEach(System.out::println);

        System.out.println("New Delhi is successfully removed from the List "+ listCityName.remove("New Delhi"));
    }
}
