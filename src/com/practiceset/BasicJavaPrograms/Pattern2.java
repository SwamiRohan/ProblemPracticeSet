package com.practiceset.BasicJavaPrograms;

import java.util.Scanner;

// Ques - To create a Pattern
/*        1  2  3  4
/      1  *  *  *  *
/      2  *  *  *
/      3  *  *
/      4  *
*/
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Pattern i.e. 3 means 3X3 ");
        int row = sc.nextInt();
        for(int i = row ; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
