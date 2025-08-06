package com.java;

public class Multi_dim_array {
    public static void main(String[] args) {

        //int [] flat THIS IS 1D

        int [][] flats = new int [2][3];
        flats[0][0] = 001; // Stored as 1
        flats[0][1] = 002; // Stored as 2
        flats[0][2] = 003; // Stored as 3
        flats[1][0] = 101;
        flats[1][1] = 102;
        flats[1][2] = 103;

        System.out.println("Printing a 2-D array using for loop");
        for(int i =0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                // Use printf for control over the precision
                // %03d means: print an integer (d) with a width of 3 characters,
                // padding with leading zeros (0) if necessary.
                System.out.printf("%03d",flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        //3D ARRAYS
// string [][][] names = new string[2][3][4]

    }
}
