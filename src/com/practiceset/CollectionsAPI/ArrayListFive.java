package com.practiceset.CollectionsAPI;

import java.sql.SQLOutput;

// Ques - How Comparable works

public class ArrayListFive {
    public static void main(String[] args) {
        String name1 = "XYZ";
        String name2 = "DEF";
        String name3 = "XYZ";

        int comparable = name1.compareTo(name2);
        System.out.println(comparable);

        comparable = name2.compareTo(name1);
        System.out.println(comparable);

        comparable = name1.compareTo(name3);
        System.out.println(comparable);

        System.out.println("name1 is equal to name3 "+name1.equals(name3));
    }
}
