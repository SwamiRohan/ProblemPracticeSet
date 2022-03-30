package com.practiceset.BasicJavaPrograms;

import java.util.Scanner;

// Ques - To find automorphic Number
// Explanation -> If we sqaure the number and if it ends with same number itself than it is called automorphic number
//                Example:- 25 is automorphic number b/c 25*25 = 625 so 625 ending with 25.
public class AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int temp = num;
        int sqNum = num * num ;
        int tempSq = sqNum;
        boolean result = true;
        while(temp > 0){
            if(temp%10 != tempSq%10){
                result = false;
            }
            temp = temp/10;
            tempSq = tempSq/10;
        }
        if(result != false ){
            System.out.println(num + " is automorphic Number because its square "+ sqNum+" ends with same number");
        }
        else{
            System.out.println(num +" is not automorphic Number because its square "+ sqNum+"  does not ends with same number");
        }
    }
}
