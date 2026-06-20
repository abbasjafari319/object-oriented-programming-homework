package chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Chapter8 {
    
     private static final char EMPTY = ' ';
    private static final char X = 'X';
    private static final char O = 'O';
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        
        
//        Q_1
//        // Prompt the user to enter 10 numbers
//        System.out.println("Enter 10 numbers:");
//        int[] numbers = new int[10];
//        for (int i = 0; i < 10; i++) {
//            numbers[i] = scanner.nextInt();
//        }
//
//        // Eliminate duplicates and display the distinct numbers separated by exactly one space
//        int[] distinctNumbers = eliminateDuplicates(numbers);
//        System.out.print("The distinct numbers are: ");
//
//        for (int num : distinctNumbers) {
//            System.out.print(num + " ");
//        }
//
//        scanner.close();
//    }
//
//    // Method to return a new array by eliminating the duplicate values in the array
//    public static int[] eliminateDuplicates(int[] list) {
//        if (list == null || list.length == 0) {
//            throw new IllegalArgumentException("Array must not be null or empty");
//        }
//
//        boolean[] seen = new boolean[list.length];
//        int count = 0;
//
//        for (int i = 0; i < list.length; i++) {
//            if (!seen[i]) {
//                seen[i] = true;
//                list[count++] = list[i];
//            }
//        }
//
//        return Arrays.copyOf(list, count);
        




//    Q_2
//// Prompt the user to enter a 4-by-4 matrix row by row
//        System.out.println("Enter a 4-by-4 matrix row by row:");
//        double[][] matrix = new double[4][4];
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                matrix[i][j] = scanner.nextDouble();
//            }
//        }
//
//        // Display the sum of all elements in the major diagonal
//        double sumMajorDiagonal = sumMajorDiagonal(matrix);
//        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal);
//
//        scanner.close();
//    }
//
//    // Method to return the sum of all the numbers in the major diagonal in a matrix
//    public static double sumMajorDiagonal(double[][] m) {
//        if (m == null || m.length == 0 || m[0].length == 0) {
//            throw new IllegalArgumentException("Matrix must not be null or empty");
//        }
//
//        double sum = 0;
//
//        for (int i = 0; i < Math.min(m.length, m[0].length); i++) {
//            sum += m[i][i];
//        }
//
//        return sum;





//  Q_3
//// Sample data: Students with their scores and number of correct answers
//        String[] studentNames = {"Alice", "Bob", "Charlie", "David", "Eve"};
//        int[] scores = {85, 92, 78, 88, 91};
//        int[] correctAnswers = {4, 6, 3, 5, 7};
//
//        // Create an array of Student objects
//        Student[] students = new Student[studentNames.length];
//        for (int i = 0; i < studentNames.length; i++) {
//            students[i] = new Student(studentNames[i], scores[i], correctAnswers[i]);
//        }
//
//        // Sort the students by their number of correct answers in ascending order
//        Arrays.sort(students, Comparator.comparingInt(Student::getCorrectAnswers));
//
//        // Display the sorted list of students
//        System.out.println("Students sorted by correct answers:");
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }
//
//    static class Student implements Comparable<Student> {
//        private String name;
//        private int score;
//        private int correctAnswers;
//
//        public Student(String name, int score, int correctAnswers) {
//            this.name = name;
//            this.score = score;
//            this.correctAnswers = correctAnswers;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public int getScore() {
//            return score;
//        }
//
//        public int getCorrectAnswers() {
//            return correctAnswers;
//        }
//
//        @Override
//        public String toString() {
//            return "Student{name='" + name + "', score=" + score + ", correctAnswers=" + correctAnswers + "}";
//        }
//
//        @Override
//        public int compareTo(Student other) {
//            return Integer.compare(this.correctAnswers, other.correctAnswers);
//        }





//Q_4
// // Sample data: weekly hours for eight employees
//        int[][] weeklyHours = {
//            {2, 4, 3, 4, 5, 8, 8},
//            {7, 3, 4, 3, 3, 4, 4},
//            {3, 3, 4, 3, 3, 2, 2},
//            {9, 3, 4, 7, 3, 4, 1},
//            {3, 5, 4, 3, 6, 3, 8},
//            {3, 4, 4, 6, 3, 4, 4},
//            {3, 7, 4, 8, 3, 8, 4},
//            {6, 3, 5, 9, 2, 7, 9}
//        };
//
//        // Compute the total hours for each employee
//        int[] totalHours = new int[weeklyHours.length];
//
//        for (int i = 0; i < weeklyHours.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < weeklyHours[i].length; j++) {
//                sum += weeklyHours[i][j];
//            }
//            totalHours[i] = sum;
//        }
//
//        // Custom comparator to sort in descending order
//        Comparator<int[]> reverseOrderComparator = (a, b) -> {
//            if (b[0] == a[0]) {
//                return 0;
//            } else {
//                return b[0] - a[0];
//            }
//        };
//
//        // Sort the employees by their total hours in descending order
//        Arrays.sort(totalHours, reverseOrderComparator);
//
//        // Display the sorted list of employees and their total hours
//        System.out.println("Employees sorted by total hours:");
//        for (int i = 0; i < weeklyHours.length && i < totalHours.length; i++) {
//            int employeeId = i;
//            String employeeName = "Employee " + employeeId;
//            double totalHoursForEmployee = totalHours[i];
//            System.out.println(employeeName + ": " + totalHoursForEmployee);
//        }





//    Q_5
//// Example matrices
//        double[][] matrixA = {{1, 2},
//                                         {3, 4}};
//        
//        double[][] matrixB = {{5, 6}, 
//                                         {7, 8}};
//
//        // Add the matrices
//        double[][] resultMatrix = addMatrices(matrixA, matrixB);
//
//        // Display the result
//        System.out.println("The matrices are added as follows:");
//        for (double[] row : resultMatrix) {
//            for (double value : row) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    /**
//     * Adds two matrices.
//     *
//     * @param a The first matrix.
//     * @param b The second matrix.
//     * @return A new matrix containing the result of the addition.
//     */
//    public static double[][] addMatrices(double[][] a, double[][] b) {
//        int rows = a.length;
//        int cols = a[0].length;
//
//        // Create a new matrix to store the result
//        double[][] result = new double[rows][cols];
//
//        // Add corresponding elements from matrix1 and matrix2
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                result[i][j] = a[i][j] + b[i][j];
//            }
//        }
//
//        return result;



//    Q_6
//// Example matrices
//        double[][] matrixA = {{1, 2}, {3, 4}, {5, 6}};
//        double[][] matrixB = {{0, 2, 4}, {1, 4.5, 2.2}, {1.1, 4.3, 5.2}};
//
//        // Multiply the matrices
//        double[][] resultMatrix = multiplyMatrices(matrixA, matrixB);
//
//        // Display the result
//        System.out.println("The multiplication of the matrices is:");
//        for (double[] row : resultMatrix) {
//            for (double value : row) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    /**
//     * Multiplies two matrices.
//     *
//     * @param a The first matrix.
//     * @param b The second matrix.
//     * @return A new matrix containing the result of the multiplication.
//     */
//    public static double[][] multiplyMatrices(double[][] a, double[][] b) {
//        int rowsA = a.length;
//        int colsA = a[0].length;
//        int colsB = b[0].length;
//
//        // Check if the number of columns in A is equal to the number of rows in B
//        if (colsA != b.length) {
//            throw new IllegalArgumentException("The number of columns in matrix A must be the same as the number of rows in matrix B.");
//        }
//
//        // Create a new matrix to store the result
//        double[][] result = new double[rowsA][colsB];
//
//        // Perform matrix multiplication
//        for (int i = 0; i < rowsA; i++) {
//            for (int j = 0; j < colsB; j++) {
//                double sum = 0.0;
//                for (int k = 0; k < colsA; k++) {
//                    sum += a[i][k] * b[k][j];
//                }
//                result[i][j] = sum;
//            }
//        }
//
//        return result;




// Q_7
//double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
//                            {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3},
//                            {-1.5, 4, 2}, {5.5, 4, -0.5}};
//
//        double[] nearestPoint1 = findNearestPoints(points)[0];
//        double[] nearestPoint2 = findNearestPoints(points)[1];
//
//        System.out.println("Nearest points:");
//        System.out.println("Point 1: (" + nearestPoint1[0] + ", " + nearestPoint1[1] + ", " + nearestPoint1[2] + ")");
//        System.out.println("Point 2: (" + nearestPoint2[0] + ", " + nearestPoint2[1] + ", " + nearestPoint2[2] + ")");
//    }
//
//    public static double[][] findNearestPoints(double[][] points) {
//        if (points == null || points.length < 2) {
//            throw new IllegalArgumentException("At least two points are required.");
//        }
//
//        int numPoints = points.length;
//        double[][] distances = new double[numPoints][numPoints];
//        for (int i = 0; i < numPoints; i++) {
//            for (int j = i + 1; j < numPoints; j++) {
//                distances[i][j] = calculateDistance(points[i], points[j]);
//                distances[j][i] = distances[i][j]; // Ensure the matrix is symmetric
//            }
//        }
//
//        int minIndex = 0;
//        for (int i = 1; i < numPoints; i++) {
//            if (distances[minIndex][i] > distances[i][minIndex]) {
//                minIndex = i;
//            }
//        }
//
//        double[] nearestPoint1 = points[minIndex];
//        int secondMinIndex = -1;
//        for (int i = 0; i < numPoints; i++) {
//            if (distances[minIndex][i] == distances[i][minIndex]) {
//                if (secondMinIndex == -1 || distances[secondMinIndex][i] > distances[minIndex][i]) {
//                    secondMinIndex = i;
//                }
//            }
//        }
//
//        double[] nearestPoint2 = points[secondMinIndex];
//        return new double[][]{{nearestPoint1}, {nearestPoint2}};
//    }
//
//    public static double calculateDistance(double[] p1, double[] p2) {
//        return Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2) + Math.pow(p2[2] - p1[2], 2));        
    
    
    


//  Q_8
//        int numPoints = 8;
//        double[][] points = {{0, 0, 1}, {1, 1, -1}, {2, 2, -2},
//                            {-2, -2, 2}, {-3, -3, -3}, {-4, -4, -4},
//                            {5, 5, 5}};
//
//        double[][] closestPairs = findNearestPoints(points);
//
//        if (closestPairs != null && !closestPairs.isEmpty()) {
//            System.out.println("The closest " + closestPairs.size() + " pairs are:");
//            for (double[][] pair : closestPairs) {
//                System.out.println("(" + pair[0][0] + ", " + pair[0][1] + ", " + pair[0][2] + ") and (" + pair[1][0] + ", " +
//pair[1][1] + ", " + pair[1][2] + ")");
//            }
//        } else {
//            System.out.println("No closest pairs found.");
//        }
//    }
//
//    public static double[][] findNearestPoints(double[][] points) {
//        if (points == null || points.length < 2) {
//            throw new IllegalArgumentException("At least two points are required.");
//        }
//
//        int numPoints = points.length;
//        List<double[]> minPairs = new ArrayList<>();
//        double minDistance = Double.MAX_VALUE;
//
//        for (int i = 0; i < numPoints; i++) {
//            for (int j = i + 1; j < numPoints; j++) {
//                double distance = calculateDistance(points[i], points[j]);
//                if (distance < minDistance) {
//                    minPairs.clear();
//                    minPairs.add(new double[]{points[i], points[j]});
//                    minDistance = distance;
//                } else if (distance == minDistance) {
//                    minPairs.add(new double[]{points[i], points[j]});
//                }
//            }
//        }
//
//        return minPairs.toArray(new double[minPairs.size()][]);
//    }
//
//    public static double calculateDistance(double[] p1, double[] p2) {
//        return Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2) + Math.pow(p2[2] - p1[2], 2));





// Q_9
//       char[][] board = new char[3][3];
//       
//        boolean gameOver = false;
//
//        while (!gameOver) {
//            printBoard(board);
//
//            if (hasWinner(board, X)) {
//                System.out.println("X wins!");
//                gameOver = true;
//            } else if (hasWinner(board, O)) {
//                System.out.println("O wins!");
//                gameOver = true;
//            } else if (isBoardFull(board)) {
//                System.out.println("It's a draw!");
//                gameOver = true;
//            }
//
//            int row;
//            int col;
//
//            do {
//                System.out.print(X + " player, enter a row (0, 1, or 2): ");
//                row = scanner.nextInt();
//                System.out.print(O + " player, enter a column (0, 1, or 2): ");
//                col = scanner.nextInt();
//
//                if (board[row][col] == EMPTY) {
//                    board[row][col] = X;
//                    break;
//                } else {
//                    System.out.println("Invalid move. Try again.");
//                }
//            } while (true);
//
//            if (hasWinner(board, O)) {
//                System.out.println("O wins!");
//                gameOver = true;
//            } else if (isBoardFull(board)) {
//                System.out.println("It's a draw!");
//                gameOver = true;
//            }
//
//            row = -1;
//            col = -1;
//
//            do {
//                System.out.print(O + " player, enter a row (0, 1, or 2): ");
//                row = scanner.nextInt();
//                System.out.print(X + " player, enter a column (0, 1, or 2): ");
//                col = scanner.nextInt();
//
//                if (board[row][col] == EMPTY) {
//                    board[row][col] = O;
//                    break;
//                } else {
//                    System.out.println("Invalid move. Try again.");
//                }
//            } while (true);
//        }
//
//        scanner.close();
//    }
//
//    private static void printBoard(char[][] board) {
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    private static boolean hasWinner(char[][] board, char player) {
//        // Check rows
//        for (int i = 0; i < board.length; i++) {
//            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
//                return true;
//            }
//        }
//
//        // Check columns
//        for (int j = 0; j < board[0].length; j++) {
//            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
//                return true;
//            }
//        }
//
//        // Check diagonals
//        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player)
//            || (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
//            return true;
//        }
//
//        return false;
//    }
//
//    private static boolean isBoardFull(char[][] board) {
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                if (board[i][j] == EMPTY) {
//                    return false;
//                }
//            }
//        }
//
//        return true;



//    Q_10
//// Initialize the 4x4 matrix with random values (0 or 1)
//        Random random = new Random();
//        char[][] board = new char[4][4];
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                board[i][j] = (char) ('0' + random.nextInt(2));
//            }
//        }
//
//        // Print the matrix
//        System.out.println("Randomly filled 4x4 matrix:");
//        printMatrix(board);
//
//        // Find the first row with the most 1s
//        int largestRow = -1;
//        int largestCol = -1;
//        int maxOnesInRow = 0;
//
//        for (int i = 0; i < board.length; i++) {
//            int onesCount = 0;
//            for (int j = 0; j < board[i].length; j++) {
//                if (board[i][j] == '1') {
//                    onesCount++;
//                }
//            }
//
//            if (onesCount > maxOnesInRow) {
//                maxOnesInRow = onesCount;
//                largestRow = i;
//            }
//        }
//
//        // Find the first column with the most 1s
//        for (int j = 0; j < board[0].length; j++) {
//            int onesCount = 0;
//            for (int i = 0; i < board.length; i++) {
//                if (board[i][j] == '1') {
//                    onesCount++;
//                }
//            }
//
//            if (onesCount > maxOnesInRow) {
//                maxOnesInRow = onesCount;
//                largestCol = j;
//            }
//        }
//
//        // Print the largest row and column indices
//        System.out.println("Largest row index: " + largestRow);
//        System.out.println("Largest column index: " + largestCol);
//    }
//
//    private static void printMatrix(char[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }



//    Q_11
// // Initialize the 3x3 matrix with random values (0 or 1)
//        Random random = new Random();
//        char[][] board = new char[3][3];
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                board[i][j] = (char) ('0' + random.nextInt(2));
//            }
//        }
//
//        // Print the matrix
//        System.out.println("Randomly filled 3x3 matrix:");
//        printMatrix(board);
//
//        // Prompt the user to enter a number between 0 and 511
//       
//        int number = scanner.nextInt();
//
//        // Convert the decimal number to binary string
//        String binaryString = Integer.toBinaryString(number);
//
//        // Pad the binary string with leading zeros to match the matrix size (3x3)
//        while (binaryString.length() < 9) {
//            binaryString = "0" + binaryString;
//        }
//
//        // Print the corresponding matrix with 'H' and 'T'
//        System.out.println("Corresponding matrix:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (binaryString.charAt(i * 3 + j) == '1') {
//                    System.out.print('H');
//                } else {
//                    System.out.print('T');
//                }
//            }
//            System.out.println();
//        }
//
//        scanner.close();
//    }
//
//    private static void printMatrix(char[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }


    
    
    }
    
}
