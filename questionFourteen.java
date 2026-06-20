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
public class questionFourteen {
    public static void main(String[] args){
        // Prompt the user to enter five numbers
        System.out.println("Enter five numbers:");
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        // Compute the GCD using the gcd method
        int gcd = gcd(numbers);

        // Display the GCD
        System.out.println("The GCD of the numbers is: " + gcd);

        input.close();
    }

    // Method to return the gcd of an unspecified number of integers
    public static int gcd(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            while (numbers[i] != 0) {
                int temp = numbers[i];
                numbers[i] = numbers[i] % result;
                result = temp;
            }
        }

        return result;

    }
}
