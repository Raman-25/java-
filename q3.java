package com.java.ArrayF;

public class q3 {
    public static void main(String[] args) {
        float [] marks = {23.4f,24.5f,25.7f,26.8f,27.7f};
        float sum = 0f;
        for(float element:marks) {
            sum = sum+element;
        }
        System.out.println(sum/5);
    }
}
//USING FOR EACH LOOP