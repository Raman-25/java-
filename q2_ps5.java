package com.java;
import java.util.Scanner;

public class q2_ps5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Value");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++){
            System.out.println(2 * i);
            sum = sum + 2 * i;
        }
        System.out.println("The sum of N even Natural Number is " + sum);


    }
}
