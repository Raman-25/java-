package com.java;

public class Method_overloding {
    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void foo(int a, int b, int c){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void change(int a){
        a = 98;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    public static void main(String[] args) {
         tellJoke();   // Calling tell joke function/method

        // Case 1: Changing the Integer
        int x = 45;
        change(x);     //Here the x don't change as the copy of X is passed
        System.out.println("The value of x after running change is: " + x);

        // Case 1: Changing the Array
         int [] marks = {52, 73, 77, 89, 98, 94};
         change2(marks); // Here the arr[0] changes as the arr refrence/adresss is copied above
         System.out.println("The value of x after running change is: " + marks[0]);


        // Method Overloading
        foo();
        foo(3000);
        foo(3000, 4000);
        // Arguments are actual!
        // Parameter are A and B


    }
}
