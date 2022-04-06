package com.practiceset.CollectionsAPI;

// printing elements of list using lambda expression

import java.util.ArrayList;
import java.util.List;

public class LambdaOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("two");
        list.add("three");
        list.add("four");

        list.forEach((n)-> System.out.println(n));
    }
}
