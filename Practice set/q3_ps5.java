package com.java;
import java.util.Scanner;

public class q3_ps5 {
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Value");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 10; i>0; i--){
            int multi = n*i;
            sum = sum +multi;
            System.out.printf("%d * %d = %d\n", n, i, multi);
        }
        System.out.println("The Sum is " + sum);
// printf for this method
    }
}
