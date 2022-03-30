package com.practiceset;

import java.util.Scanner;

// Ques - To sort the elements of array in ascending order/increasing order
// Explanation - If elements in array is {1,4,5,2,3} than after sorting it will be {1,2,3,4,5}
public class SortArray {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of an array before sort");
        for(int a:arr){
            System.out.print(a +" ");
        }
        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                  temp = arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                }
            }
        }
        System.out.println("\nElements of an array after sorting it");
        for(int a:arr){
            System.out.print(a + " ");
        }
        sc.close();
    }
}
