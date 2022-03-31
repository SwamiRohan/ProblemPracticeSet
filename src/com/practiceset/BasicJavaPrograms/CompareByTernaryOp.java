package com.practiceset.BasicJavaPrograms;

import java.util.Scanner;

// Ques - Compare three number using ternary operator
// Explanation -> Syntax of Ternary is variable = expression ? value if true : value if false
public class CompareByTernaryOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();
        int tempMax = num1 < num2 ? num2 : num1;
        int result = tempMax >= num3 ? tempMax : num3;
        int tempMin = num1 > num2 ? num2 : num1;
        int resultMin = tempMin <= num3 ? tempMin : num3;
        System.out.println("Greatest Number among them is "+result);
        System.out.println("Smallest Number among them is "+resultMin);
    }
}
