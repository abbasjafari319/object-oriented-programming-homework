/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.eigth;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author AJ
 */
public class questionTHree {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Sample data: Students with their scores and number of correct answers
        String[] studentNames = {"Alice", "Bob", "Charlie", "David", "Eve"};
        int[] scores = {85, 92, 78, 88, 91};
        int[] correctAnswers = {4, 6, 3, 5, 7};

        // Create an array of Student objects
        Student[] students = new Student[studentNames.length];
        for (int i = 0; i < studentNames.length; i++) {
            students[i] = new Student(studentNames[i], scores[i], correctAnswers[i]);
        }

        // Sort the students by their number of correct answers in ascending order
        Arrays.sort(students, Comparator.comparingInt(Student::getCorrectAnswers));

        // Display the sorted list of students
        System.out.println("Students sorted by correct answers:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    static class Student implements Comparable<Student> {
        private String name;
        private int score;
        private int correctAnswers;

        public Student(String name, int score, int correctAnswers) {
            this.name = name;
            this.score = score;
            this.correctAnswers = correctAnswers;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public int getCorrectAnswers() {
            return correctAnswers;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', score=" + score + ", correctAnswers=" + correctAnswers + "}";
        }

        @Override
        public int compareTo(Student other) {
            return Integer.compare(this.correctAnswers, other.correctAnswers);
        }

}
