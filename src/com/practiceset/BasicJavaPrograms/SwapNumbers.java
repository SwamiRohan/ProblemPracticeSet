package com.practiceset;

import java.util.Scanner;

// Ques - Swap two number without using third variable
public class SwapNumbers {
    public static void swapNo(int no1, int no2){
        no2 = no1 + no2;  // 10 + 20 = 30
        no1 = no2 - no1;  // 30 - 10 = 20
        no2 = no2 - no1;  //
        System.out.println("Numbers after Swap : Number 1 = " + no1 + " Number 2 = " + no2 );
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers you want to swap: Number 1 ");
        int number1 = sc.nextInt();
        System.out.println("Number 2 ");
        int number2 = sc.nextInt();
        swapNo(number1,number2);
        sc.close();
    }

}
