package com.practiceset;

import java.util.Scanner;
// Ques - To check entered number is armstrong or not
// Explanation -> if number is 121 so 1^3 + 2^3 + 1^3 if == 121 than no. is armstrong else not
// few Armstrong numbers are 153, 370, 371 etc
public class Armstrong {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        num = sc.nextInt();
        int temp = num;
        int c = 0;
        int count = 0;
        int a;
        int length = String.valueOf(num).length();
        while(num>0){
            a=num%10;
            num=num/10;
            c = (int) (c + (Math.pow(a,length)));
        }
        if(temp==c) System.out.println("Entered number is "+ temp +" and it is armstrong");
        else System.out.println("Entered number is "+ temp +" and it is not armstrong");
        sc.close();
    }
}
