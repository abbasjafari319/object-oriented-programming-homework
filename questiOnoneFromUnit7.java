
package unit.seven;
import java.*;
import java.util.Scanner;


public class questiOnoneFromUnit7 {
    public static void main(String[] args){
         System.out.print("Enter the number of student: ");
         Scanner input = new Scanner(System.in);
        int Snum = input.nextInt();
        
        int[] Score = new int[Snum];
        System.out.print("Enter "+Snum+" score: ");
        for(int i = 0; i<Snum; i++)
        {
            Score[i] = input.nextInt();
        }
        int best = 0;
        for(int i = 0; i<Snum; i++)
        {
            if(Score[i]>best)
                best = Score[i];
            else;
        }
       
        for(int i = 0; i<Snum; i++)
        {
            if(Score[i]>= best-10)
                System.out.println("Student "+i+" score is "+Score[i]+" and grade is A");
            else if(Score[i]>= best-20)
                System.out.println("Student "+i+" score is "+Score[i]+" and grade is B");
            else if(Score[i]>= best-30)
                System.out.println("Student "+i+" score is "+Score[i]+" and grade is C");
            else if(Score[i]>= best-40)
                System.out.println("Student "+i+" score is "+Score[i]+" and grade is D");
            else
                System.out.println("Student "+i+" score is "+Score[i]+" and grade is F");
                

    }
    
}
