package com.practiceset.CollectionsAPI;

import java.util.ArrayList;
import java.util.List;

// Ques - Initializing list from other list
public class LinkedListFour {
    public static void main(String[] args) {
        // list creation
        List<Integer> listOne = new ArrayList<>();

        // list initialization with creation
        List<Integer> listTwo = new ArrayList<>(List.of(10,20,30));

        // listOne initializing using listTwo elements
        listOne.addAll(listTwo);

        System.out.println("Elements of ListOne are");
        listOne.forEach(System.out::println);

        System.out.println();
        System.out.println("Elements of ListTwo are");
        listTwo.forEach(System.out::println);


    }
}
