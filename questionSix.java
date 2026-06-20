/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.eigth;

import java.util.Scanner;

/**
 *
 * @author AJ
 */
public class questionSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Example matrices
        double[][] matrixA = {{1, 2}, {3, 4}, {5, 6}};
        double[][] matrixB = {{0, 2, 4}, {1, 4.5, 2.2}, {1.1, 4.3, 5.2}};

        // Multiply the matrices
        double[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        // Display the result
        System.out.println("The multiplication of the matrices is:");
        for (double[] row : resultMatrix) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    /**
     * Multiplies two matrices.
     *
     * @param a The first matrix.
     * @param b The second matrix.
     * @return A new matrix containing the result of the multiplication.
     */
    public static double[][] multiplyMatrices(double[][] a, double[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;

        // Check if the number of columns in A is equal to the number of rows in B
        if (colsA != b.length) {
            throw new IllegalArgumentException("The number of columns in matrix A must be the same as the number of rows in matrix B.");
        }

        // Create a new matrix to store the result
        double[][] result = new double[rowsA][colsB];

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                double sum = 0.0;
                for (int k = 0; k < colsA; k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;

    
}
