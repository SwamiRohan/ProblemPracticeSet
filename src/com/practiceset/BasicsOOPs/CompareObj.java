package com.practiceset.BasicsOOPs;

// Ques - To compare two objects in java
// Explanation -> equals() method compares the equality of two objects
//                == is used to compare if two reference are equal or not.
public class CompareObj {
    public static void main(String[] args) {
        Integer x = 1234;
        Float y = 1234.0f;
        Double z = 1234.0;
        System.out.println("Integer and Float are equal it is "+ x.equals(y));
        System.out.println("Integer and Double are equal it is "+ x.equals(z));
        System.out.println("Float and Double are equal it is "+ y.equals(z));
        System.out.println("x is equal to 1234 it is "+ x.equals(1234));
        System.out.println("y is equal to 1234.0f it is "+y.equals(1234.0f));
        System.out.println("z is equal to 1234.0 it is "+z.equals(1234.0));

    }
}
