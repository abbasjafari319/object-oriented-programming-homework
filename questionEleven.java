/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.seven;

import java.util.Scanner;

/**
 *
 * @author AJ
 */
public class questionEleven {
    public static void main(String[] args){
                // Prompt the user to enter 10 numbers
                Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        // Calculate and display the mean
        double mean = mean(numbers);
        System.out.println("The mean is: " + mean);

        // Calculate and display the standard deviation using the deviation method
        double stdDeviation = deviation(numbers);
        System.out.println("The standard deviation is: " + stdDeviation);

        input.close();
    }

    // Method to compute the mean of an array of double values
    public static double mean(double[] x) {
        if (x == null || x.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        double sum = 0;
        for (double num : x) {
            sum += num;
        }
        return sum / x.length;
    }

    // Method to compute the deviation of an array of double values
    public static double deviation(double[] x) {
        if (x == null || x.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        double mean = mean(x);
        double sumOfSquares = 0;

        for (double num : x) {
            sumOfSquares += Math.pow(num - mean, 2);
        }

        return Math.sqrt(sumOfSquares / (x.length - 1));

    }
    
}
