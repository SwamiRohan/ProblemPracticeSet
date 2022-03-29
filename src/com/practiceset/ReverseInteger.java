package com.practiceset;

import java.util.Scanner;

// Ques - To reverse an integer in array
// Explanation - if entered input is 2345 than output should be reverse of that i.e. 5432
public class ReverseInteger {
    public static void main(String[] args) {
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input");
        int input = sc.nextInt();
        while(input!=0){
            reverse = reverse*10 + input%10;
            input = input/10;
        }
        System.out.println("Number after reverse is "+ reverse);
    }
}
