package com.practiceset.BasicsOOPs;

// Ques - To create object in java
public class CreateObj {
    public static class ObjectCreation{
        void print(){
            System.out.println("Object Created Successfully");
        }
    }
    public static void main(String[] args) {
        ObjectCreation objCreate = new ObjectCreation();
        objCreate.print();
    }
}
