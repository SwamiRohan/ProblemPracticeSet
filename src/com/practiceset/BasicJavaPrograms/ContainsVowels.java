package com.practiceset;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Ques - To check if String contains vowels or not
// Explanation -> if input string is rohan than answer should be Yes,it contains vowels because of o and a
public class ContainsVowels {
    public static void main(String[] args) {
        String regex = "[aeiouAEIOU]";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check if it contains vowel or not");
        String input = sc.nextLine();
        Pattern compile = Pattern.compile(regex);
        Matcher match = compile.matcher(input);
        if(match.find()){
            System.out.println("Yes,entered string "+ input +" contain vowels");
        }
        else{
            System.out.println("No,entered string "+ input +" does not contain vowels");
        }
        sc.close();
    }
}
