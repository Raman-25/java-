package com.java.ArrayF;

public class maximum {
    public static void main(String[] args) {
        int[] arr = {6, 3, -466, 5, 8};
        int max = Integer.MIN_VALUE;

        for(int element:arr){
            if(element>max){
                max=element;
            }
        }
        System.out.println("The maximum element is "+ max );


    }
}


