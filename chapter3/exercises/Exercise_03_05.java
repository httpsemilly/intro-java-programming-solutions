package chapter3.exercises;

import java.util.*;

public class Exercise_03_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int today;
        int daysElapsed;
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.print("Enter today's day (from 0 to 6): ");
        today = scanner.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        daysElapsed = scanner.nextInt();

        int futureDay = (today + daysElapsed) % 7;

        if(daysElapsed < 7) {
            System.out.println("Today is " + daysOfWeek[today] + " and the future day is " + daysOfWeek[today + daysElapsed]);
        } else {
            System.out.println("Today is " + daysOfWeek[today] + " and the future day is " + daysOfWeek[futureDay]);
        }

        scanner.close();
    }      
}
