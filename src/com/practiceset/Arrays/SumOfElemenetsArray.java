package com.practiceset.Arrays;

import java.util.Scanner;
// Ques - To calculate the sum of elements of an array
// Explanation - if array contains elements {1,2,3,4,5} so, output should be 1+2+3+4+5=15
public class SumOfElemenetsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        System.out.println("Enter the elements in array");
        for(int i=0; i< arr.length;i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("sum of Elements of array is " + sum);
    }
}
