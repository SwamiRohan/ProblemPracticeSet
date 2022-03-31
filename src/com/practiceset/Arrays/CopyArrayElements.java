package com.practiceset.Arrays;

// Ques - To copy the elements of one array into another array

import java.util.Scanner;

public class CopyArrayElements {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        size = sc.nextInt();
        int[] arrayOne = new int[size];
        int[] arrayTwo = new int[size];
        System.out.println("Enter the elements in the array");
        for(int i=0; i<size; i++){
            arrayOne[i] = sc.nextInt();
        }
        for(int i=0; i<arrayOne.length; i++){
            arrayTwo[i]= arrayOne[i];
        }
        System.out.println("Printing the Elements of first Array");
        for(int a : arrayOne){
            System.out.print(a + " ");
        }
        System.out.println("\nPrinting Elements of Second Array");
        for(int a : arrayTwo){
            System.out.print(a + " ");
        }
        sc.close();
    }
}
