package chapter3.exercises;

import java.util.*;

public class Exercise_03_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        double discriminant;
        double root1, root2; 

        System.out.print("Enter the value of 'a': ");
        a = scanner.nextDouble();

        System.out.print("Enter the value of 'b': ");
        b = scanner.nextDouble();

        System.out.print("Enter the value of 'c': ");
        c = scanner.nextDouble();

        discriminant = Math.pow(b, 2) - (4*a*c);

        if(discriminant > 0) {
            root1 = (-b + Math.pow(discriminant, 0.5)) / (2*a);
            root2 = (-b - Math.pow(discriminant, 0.5)) / (2*a);

            System.out.println("The equation has two roots: " + root1 + " and " + root2);
        } else if(discriminant == 0) {
            root1 = (-b + Math.pow(discriminant, 0.5)) / (2*a);
            
            System.out.println("The equation has one root: " + root1);
        } else {
            System.out.println("The equation has no real roots");
        }

        scanner.close();
    }
}