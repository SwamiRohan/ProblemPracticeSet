package com.practiceset;

import java.util.Scanner;

// Ques - Reverse the input string
public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String your want to reverse");
        String input = sc.nextLine();
        System.out.println(reverseString(input));
        sc.close();
    }
    // reversing string by creating my own reverse method
    public static String reverseString(String str){
        if(str.isEmpty())
            return "Input String is Empty";

        StringBuilder o = new StringBuilder();
        char[] chars = str.toCharArray();
        for(int i = chars.length-1;i>=0;i--)
            o.append(chars[i]);
            return o.toString();
    }
}
