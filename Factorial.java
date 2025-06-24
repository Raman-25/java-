package com.java;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Value");
        int n = sc.nextInt();

//  Factorial =  5!= 5*4*3*2*1

         int Factorial = 1;
             for (int i =n; i >= 1; i--) {
                 Factorial = Factorial*i;
            }
            System.out.println("The factorial of " + n + " is " + Factorial);

// USING WHILE LOOP
         /*int Factorial=1;
        int i = n;
        while(i >= 1){
            Factorial = Factorial*i;
            i--;
        }
        System.out.println("The factorial of " + n + " is " + Factorial);
          */
    }

}
