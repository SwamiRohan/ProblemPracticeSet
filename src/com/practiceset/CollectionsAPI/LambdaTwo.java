package com.practiceset.CollectionsAPI;

import java.util.Scanner;

// Ques - addition of two numbers using lambda expression and interface
public class LambdaTwo {
    interface Addable {
        int add(int a, int b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int numOne = sc.nextInt();
        System.out.println("Enter Second Number");
        int numTwo  = sc.nextInt();
        Addable add1 = (a,b) -> (a+b);
        System.out.println(add1.add(numOne,numTwo));
        sc.close();
    }
}

