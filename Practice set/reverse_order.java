package com.java;
import java.util.Scanner;

public class reverse_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int n = sc.nextInt();

        System.out.println("First n natural numbers are: ");
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
        System.out.println("The reverse order is: ");
        for(int i=n; i>0; i--){
            System.out.println(i);
        }
    }
}

// FOR WHOLE NO 0
// NATURAL Q