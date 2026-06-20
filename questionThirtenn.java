/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.seven;

import static java.lang.Math.random;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author AJ
 */
public class questionThirtenn {
    public static void main(String[] args){
        Random random = new Random();

        // Generate 45 random numbers between 1 and 100 excluding 4,8,95, and 93
        for (int i = 0; i < 45; i++) {
            int randomNumber = getRandom(1, 100, 4, 8, 95, 93);
            System.out.printf("%4d", randomNumber);

            if ((i + 1) % 15 == 0) {
                System.out.println();
            }
        }
    }

    // Method to return a random number between start and end, excluding the numbers
    public static int getRandom(int start, int end, int... numbers) {
        if (start > end || start < 0 || end >= 100) {
            throw new IllegalArgumentException("Invalid range");
        }

        int[] allNumbers = new int[end - start + 1];
        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = start + i;
        }

        // Remove the numbers that are to be excluded
        int countToRemove = 0;
        for (int number : numbers) {
            if (number >= start && number <= end) {
                countToRemove++;
            }
        }

        int[] filteredNumbers = new int[allNumbers.length - countToRemove];
        int filteredIndex = 0;

        for (int i = 0; i < allNumbers.length; i++) {
            if (!Arrays.asList(numbers).contains(allNumbers[i])) {
                filteredNumbers[filteredIndex++] = allNumbers[i];
            }
        }

        // Generate a random index from the remaining numbers
        int randomIndex = random.nextInt(filteredNumbers.length);
        return filteredNumbers[randomIndex];
    }
    
}
