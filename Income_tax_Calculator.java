package com.java;
import java.util.Scanner;

public class Income_tax_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income in lakhs");
        float income = sc.nextFloat();
        float tax = 0;


        if (income <=2.5f) {
            System.out.println("No Income tax");
        }
        else if (income >2.5f && income <=5.0f) {
            tax = (float) (tax + 0.05f * (income - 2.5f));
            System.out.println("Your income tax is ₹" + tax * 100000 );
        }
        else if (income >5.0f && income <=10.0f) {
            tax = (float)  0.05*(5.0f-2.5f);
            tax = (float) (tax + 0.2* (income-5.0f));
            System.out.println("Your income tax is ₹" + tax * 100000 );

        }
        else if (income >10.f) {
            tax = (float)  0.05* (5.0f-2.5f);
            tax = (float) (tax + 0.2* (10.0f-5.0f));
            tax = (float) (tax + 0.3* (income-10.0f));
            System.out.println("Your income tax is ₹" + tax * 100000 );
        }

    }
}