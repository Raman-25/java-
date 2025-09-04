package com.java;
import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100!= 0) || (year % 400 == 0)) {
            System.out.println("It's is Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
