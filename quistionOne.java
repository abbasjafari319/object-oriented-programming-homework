/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.eigth;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AJ
 */
public class quistionOne {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
                // Prompt the user to enter 10 numbers
        System.out.println("Enter 10 numbers:");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Eliminate duplicates and display the distinct numbers separated by exactly one space
        int[] distinctNumbers = eliminateDuplicates(numbers);
        System.out.print("The distinct numbers are: ");

        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    // Method to return a new array by eliminating the duplicate values in the array
    public static int[] eliminateDuplicates(int[] list) {
        if (list == null || list.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        boolean[] seen = new boolean[list.length];
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            if (!seen[i]) {
                seen[i] = true;
                list[count++] = list[i];
            }
        }

        return Arrays.copyOf(list, count);
        

    }
}
