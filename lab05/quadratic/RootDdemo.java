/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author MUHAMMAD
 */
public class RootDdemo {
    public static void main(String[] args) {
        double a,b,c,root1,root2,discriminant;
        Scanner input =  new Scanner(System.in);
        
        System.out.print("Enter a: ");
        a = input.nextDouble();
        System.out.print("Enter b: ");
        b = input.nextDouble();
        System.out.print("Enter c: ");
        c = input.nextDouble();
        discriminant = Math.pow(b, 2) - (4 * a * c);
        root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        
        if(discriminant > 0){
            System.out.printf("The roots are real and distinct: %.2f, %.2f\n", root1, root2);
        }else if(discriminant == 0){
            System.out.printf("The roots are real and equal: %.2f\n", root1);
        }else if (discriminant < 0){
            System.out.print("The roots are complex\n");
        }
    }
}