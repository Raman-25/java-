package com.java.ArrayF;

public class q6 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 466, 5, 8,-677};
        int min= Integer.MAX_VALUE;

        for(int e:arr){
            if(e<min){
                min = e;
            }
        }
        System.out.println("The minimum element is " + min );
    }
}