package com.practiceset.ExceptionHandling;
import java.util.Scanner;

// Ques - Handling Number Format Exception  using try catch block
// Explanation required input type is integer if you pass other than integer it will move to catch block and print
//              Invalid Input
//              else print the integer
public class ExceptionOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        String input = sc.nextLine();
        int value = 0;
        try{
            value = Integer.parseInt(input);
            System.out.println("Number is "+ value);
        }
        catch (NumberFormatException e){
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
