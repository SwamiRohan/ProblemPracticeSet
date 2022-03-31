package com.practiceset.Arrays;

import java.util.Scanner;

// Ques - To print the odd place and even place elements of an array separately
// Explanation - if array elements are {1,2,3,4,5} than odd place elements are {1,3,5} and even place elements are {2,4}
public class ElementsByPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int oddSize = (int) Math.ceil((size+1)/2);
        int evenSize = Math.floorDiv(size,2);
        int[] arrayOne = new int[size];
        int[] arrayTwo = new int[oddSize];
        int[] arrayThree = new int[evenSize];
        System.out.println("Enter elements in the array");
        for (int i = 0; i < size; i++) {
            arrayOne[i] = sc.nextInt();
        }
        int j = 0;
        int k = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            if (i % 2 == 0) {
                arrayTwo[j] = arrayOne[i];
                ++j;
            } else {
                arrayThree[k] = arrayOne[i];
                ++k;
            }
        }
        System.out.println("\nElements of an array ");
        for (int a : arrayOne) {
            System.out.print(a + " ");
        }
        System.out.println("\nElements at even place ");
        for (int a : arrayTwo) {
            System.out.print("\n" + a + " ");
        }
        System.out.println("\nElements at odd place");
        for (int a : arrayThree) {
            System.out.print("\n" + a + " ");
        }
    }
}

