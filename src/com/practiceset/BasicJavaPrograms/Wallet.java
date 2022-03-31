package com.practiceset.BasicJavaPrograms;

// Ques - Make a program that can perform various operations like withdraw money, add money and print balance

import java.util.Scanner;

public class Wallet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int withdraw;
        int deposit;
        int choose;
        String name;
        System.out.println("Enter your name ");
        name = sc.nextLine();
        System.out.println("Welcome, " + name);
        while(true){
            System.out.println("Choose the operation that you want to perform ");
            System.out.println("'1' for adding money in wallet");
            System.out.println("'2' for withdraw money from wallet");
            System.out.println("'3' to know your current balance");
            System.out.println("'4' to exit");
            choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Enter the amount you want to add");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println(deposit + " added successfully in your wallet");
                break;
            case 2:
                System.out.println("Enter the amount you want to withdraw");
                withdraw = sc.nextInt();
                if (balance >= withdraw) {
                    balance = balance - withdraw;
                } else {
                    System.out.println("Insufficient Balance cannot withdraw amount " + withdraw);
                }
                System.out.println(withdraw + " withdrawal successfully from wallet");
                break;
            case 3:
                System.out.println("Your current Balance is " + balance);
                break;
            case 4 :
                System.exit(0);
            default:
                System.out.println("Invalid command choose proper command");
            }
        }
    }
}
