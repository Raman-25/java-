package com.java;
import java.util.Scanner;

public class que_set5 {
    public static void main (String []args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter A Value");
      int n = sc.nextInt();

      for(int i=n;i!=0;i--){
          for(int j =1;j<=i;j++){
              System.out.print("*");
          }
          System.out.print("\n");
      }
    }
}
