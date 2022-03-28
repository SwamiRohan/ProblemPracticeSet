package com.practiceset;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the series number");
        int n = sc.nextInt();
        printFiboSeries(n);
        System.out.println("\nSum of series is ");
        System.out.println(printFiboSum(n));
    }
    // Output Explanation:-
    // for n = 5 series will be -> 1 1 2 3 5 so the output will be number at 5th position
    public static int printFiboSum(int n){
        if(n <= 1)    return n;
        else
            return printFiboSum(n-1) + printFiboSum(n-2);
    }
    public static void printFiboSeries(int n){
        int a = 0;
        int b = 1;
        int c = 1;
        System.out.println("The Series is ");
        for (int i = 1; i <= n; i++){
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a+b;
        }
    }
}
