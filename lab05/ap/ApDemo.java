/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap;
import java.util.Scanner;
/**
 *
 * @author MUHAMMAD
 */
public class ApDemo {
    public static void main(String[] args) {
        int a, d, n;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first term a: ");
        a = input.nextInt();
        System.out.print("Enter common difference d: ");
        d = input.nextInt();
        System.out.print("number of terms n: ");
        n = input.nextInt();
        
        if(n > 0) {
            double tn = a + (n-1) * d, sn = (n/2) * (a + tn);
            
            System.out.printf("The nth term of the series Tn = %.2f\n the sum of the first n term Sn = %.2f\n", tn, sn);
        }
        else {
            System.out.print("Please ensure the number of terms n is a positive number\n");
        }
    }
}
