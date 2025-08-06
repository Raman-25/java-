package com.java;
import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Value");
        int n = sc.nextInt();

        // ODD NO 2N+1
        System.out.println("First N Odd Number Are");
        for(int i=1; i<=n; i++){
            System.out.println(2*i+1);
        }

        // EVEN NO 2N
        System.out.println("First N Even Number Are");
        for(int i=1; i<=n; i++){
            System.out.println(2*i);
        }
    }

}
