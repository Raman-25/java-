package com.java.ArrayF;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = {5, 6, 7, 8};
        System.out.println(marks[3]);
        System.out.println(marks.length);
        //DISPLAYING THE ARRAY
        for(int i=3;i>=0;i--){
            System.out.print(marks[i]+",");
        }
    }
}

