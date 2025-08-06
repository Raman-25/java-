package com.java.ArrayF;

public class reverse_array {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 4};
        /*
        we want int[]a2={6,5,4,3,2,1}
        mid point is 3
         */
        int[] a2 = new int[6];

        for (int i = 0, j = a1.length - 1; i < a1.length; i++, j--) {
            a2[i] = a1[j];
        }
        for (int element:a2){
            System.out.print(element+" ");
        }

    }
}
