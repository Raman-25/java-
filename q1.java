package com.java.ArrayF;

public class q1 {
    public static void main(String[] args) {
    float [] marks = {23.4f,24.5f,25.7f,26.8f,27.7f};
    float sum = 0f;
     for(int i = 0; i<=marks.length-1;i++) {
         sum = sum+marks[i];
     }
        System.out.println(sum);
    }
}
