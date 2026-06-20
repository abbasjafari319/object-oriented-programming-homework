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
public class questionTwelve {
    public static void main(String[] args){
        // Prompt the user to enter 10 numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // Reverse the array using the reverse method
        int[] reversedArray = reverse(numbers);

        // Display the reversed numbers
        System.out.println("The reversed array is:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }

        input.close();
    }

    // Method to reverse an array passed in the argument and return it
    public static int[] reverse(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        return reversed;

    }
    
}
