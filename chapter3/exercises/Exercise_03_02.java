package chapter3.exercises;

import java.util.*;

public class Exercise_03_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);

        int answer;
        int result = number1 + number2 + number3;

        System.out.println("What is the sum of " + number1 + " + " + number2 + " + " + number3 + "?");
        System.out.print("Your answer: ");
        answer = scanner.nextInt();

        if(answer == result) {
            System.out.println("Your answer is correct!");
        } else {
            System.out.println("Your answer is wrong");
            System.out.println("The sum of " + number1 + " + " + number2 + " + " + number3 + " is " + result);
        }

        scanner.close();
    }
}
