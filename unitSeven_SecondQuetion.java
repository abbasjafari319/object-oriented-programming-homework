
package unit.seven;

import java.util.Scanner;

public class unitSeven_SecondQuetion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        int[] numbers = new int[10];
        System.out.print("enter 10 numbers : ");
        for(int i = 0; i<numbers.length; i++)
        {
            numbers[i] = input.nextInt();
        }
        System.out.println("--------------");
        for(int i = numbers.length-1; i>=0; i--)
        {
            System.out.println(numbers[i]);
        }}
    }
    

