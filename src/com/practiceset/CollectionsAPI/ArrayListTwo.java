package com.practiceset.CollectionsAPI;

import java.util.ArrayList;
// Ques - Different ways to print ArrayList
public class ArrayListTwo {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(56);
        number.add(-1);
        number.add(45);

        System.out.println("First way to print ");
        System.out.println(number);
        System.out.println();

        System.out.println("Second way to print ");
        for(var n : number){
            System.out.print(n+" ");
        }

        System.out.println();
        System.out.println("Third way to print ");
        number.forEach(System.out::print);

        System.out.println();
        System.out.println("Fourth way to print ");
        for(int i=0;i<number.size();i++){
            Integer n = number.get(i);
            System.out.print(n+" ");
        }

        System.out.println();
        System.out.println("Fifth way to print ");
        System.out.println(number.get(0));
        System.out.println(number.get(1));
        System.out.println(number.get(2));
        System.out.println(number.get(3));
    }
}
