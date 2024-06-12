package chapter3.case_studies;

import java.util.*;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        String chineseZodiacSign = "";

        System.out.println("Enter a year: ");
        year = scanner.nextInt();

        switch(year % 12) {
            case 0: chineseZodiacSign = "monkey"; 
            break;
            case 1: chineseZodiacSign = "rooster"; 
            break;
            case 2: chineseZodiacSign = "dog"; 
            break;
            case 3: chineseZodiacSign = "pig"; 
            break;
            case 4: chineseZodiacSign = "rat";
            break;
            case 5: chineseZodiacSign = "ox";
            break;
            case 6: chineseZodiacSign = "tiger";
            break;
            case 7: chineseZodiacSign = "rabbit";
            break;
            case 8: chineseZodiacSign = "dragon";
            break;
            case 9: chineseZodiacSign = "snake";
            break;
            case 10: chineseZodiacSign = "horse";
            break;
            case 11: chineseZodiacSign = "sheep";
            break;
        }

        System.out.println("The Chinese zodiac sign for the year " + year + " is " + chineseZodiacSign);

        scanner.close();
    }
}