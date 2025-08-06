package com.java.ArrayF;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        float [] marks = {23.4f,24.5f,25.7f,26.8f,27.7f};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        float number = sc.nextFloat();

        for (float element : marks) {
            if (number == element) {
                System.out.println("The number " + number + " is in the array.");
                return;
            }
        }
        System.out.println("The number " + number + " is NOT in the array.");
    }
}
