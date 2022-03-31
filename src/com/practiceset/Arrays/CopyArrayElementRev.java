package com.practiceset.Arrays;

import java.util.Scanner;

// Ques - Copy the elements of first array and store it into second array in reverse order
// Explanation -> For Example Elements of first array are {1,2,3,4,5}
//                            Elements of second array after performing operation {5,4,3,2,1}
public class CopyArrayElementRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of an array");
        size = sc.nextInt();
        int[] arrayOne = new int[size];
        int[] arrayTwo = new int[size];
        System.out.println("Enter the elements in the array");
        for(int i=0; i<size; i++){
            arrayOne[i] = sc.nextInt();
        }
        for(int i=0; i<arrayOne.length; i++){
            arrayTwo[--size] = arrayOne[i];
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
