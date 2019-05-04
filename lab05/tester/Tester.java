/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;
import java.util.Scanner;
/**
 *
 * @author MUHAMMAD
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int score;
        char grade;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  your score: ");
        score = input.nextInt();
        
        if(score >= 90) 
            grade = 'A';
        else if (score >= 80)
            grade = 'B';
        else if (score >= 70)
            grade = 'C';
        else if (score >= 60)
            grade = 'D';
        else
            grade = 'F';
        
        System.out.printf("Your test score is: %d, which is equivalent to the grade: %s\n", score, grade);
        
        System.out.print("Enter new score");
        score = input.nextInt();
        
        if(score >= 90)
            grade = 'A';
        if(score >= 80)
            grade = 'B';
        if(score >= 70)
            grade = 'C';
        if(score >= 60)
            grade = 'D';
        else
            grade = 'F';
        System.out.printf("Your test score is %d, which is equivalent to the grade %s\n", score,grade);
    }
    
}
