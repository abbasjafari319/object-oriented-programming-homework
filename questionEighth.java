
package unit.seven;
import java.*;
public class questionEighth {
    public static void main(String[] args){
         if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Overloaded method to calculate the average of a double[] array
    public static double average(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 10 integers
        System.out.println("Enter 10 integers:");
        int[] integerArray = new int[10];
        for (int i = 0; i < 10; i++) {
            integerArray[i] = scanner.nextInt();
        }

        // Calculate and display the average of the integers
        double averageIntegers = average(integerArray);
        System.out.println("Average of integers: " + averageIntegers);

        // Prompt the user to enter 10 double values
        System.out.println("Enter 10 double values:");
        double[] doubleArray = new double[10];
        for (int i = 0; i < 10; i++) {
            doubleArray[i] = scanner.nextDouble();
        }

        // Calculate and display the average of the doubles
        double averageDoubles = average(doubleArray);
        System.out.println("Average of doubles: " + averageDoubles);

        scanner.close();

    }
}
