package com.java;
import java.util.Scanner;

public class Strings_finder {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your website");
        String website = sc.nextLine();

        if (website.endsWith(".com")) {
            System.out.println("It's a Commercial website");
        }
        else if (website.endsWith(".in")) {
            System.out.println("It's a Indian website");
        }
        else if (website.endsWith(".org")) {
            System.out.println("It's a organization website");
        }
    }
}
