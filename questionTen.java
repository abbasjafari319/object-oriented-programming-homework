/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.seven;

/**
 *
 * @author AJ
 */
public class questionTen {
    public static void main(String[] args){
         if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        double minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 10 numbers
        System.out.println("Enter 10 numbers:");
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Calculate and display the index of the smallest element using the indexOfSmallestElement method
        int minIndex = indexOfSmallestElement(numbers);
        System.out.println("The index of the minimum number is: " + minIndex);

        scanner.close();

    }
}
