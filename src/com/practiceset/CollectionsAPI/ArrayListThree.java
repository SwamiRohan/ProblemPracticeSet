package com.practiceset.CollectionsAPI;

import java.util.ArrayList;
import java.util.Collections;

// Ques - Different operations like size(), sorting, cleaning the array, removing element
public class ArrayListThree {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(33);
        number.add(13);
        number.add(344);

        System.out.println("The Size of number Array is " + number.size());

        System.out.println("Elements in the Array as per appear ");
        number.forEach(System.out::println);

        System.out.println("Elements after sorting is applied");
        Collections.sort(number);
        number.forEach(System.out::println);

        System.out.println("Element at Index 1 " + number.get(1));
        System.out.println("Removing element which is at index 1 ");
        number.remove(1);
        System.out.println("Element at index 1 after delete operation "+ number.get(1));

        System.out.println("Cleaning the array");
        number.clear();
        System.out.println(number);
        System.out.println("Size of Array after cleaning it "+ number.size());

    }
}
