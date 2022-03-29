package com.practiceset;

import java.util.Scanner;
// Ques - To check if entered String contains repeated characters/duplicate characters
// Explanation -> if input is aba than a is duplicate character because it is repeating two times
public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int count = 0;
        for(int i=0; i<=str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(ch[i]==ch[j]){
                    System.out.println(ch[i]);
                    ++count;
                    break;
                }
            }
        }
        System.out.println("Total number of duplicate characters are: " + count);
        sc.close();
    }
}
