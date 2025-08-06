package com.java.ArrayF;

public class Additon_2D_Array {
    public static void main(String[] args) {
        /*
         TO ADD TWO 2X3 ORDER MATRICES
        1 2 3     7 8 9
        4 5 6     3 5 6
         */
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] m2 = {
                {7, 8, 9},
                {3, 5, 6}
        };

        // This will store the result of the addition
        int[][] result = new int[2][3];

        // Loop through each row
        for (int i = 0; i < m1.length; i++) {
            // Loop through each column of the current row
            for (int j = 0; j < m1[i].length; j++) {
                // Add the elements from m1 and m2 at the same position (i, j)
                // and store it in the result matrix at that same position.
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }

        // --- Print the final result matrix ---
        System.out.println("The resulting matrix is:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            // Print a new line after each row for better formatting
            System.out.println();
        }
    }
}