package chapter3.case_studies;

import java.util.*;

public class Lottery {
    public static void main(String[] args) {
        // generate a random number between 0 and 100
        int lottery = (int)(Math.random() * 100); 
        int userGuess;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your lottery pick (two digits): ");
        userGuess = scanner.nextInt();

        // get digits from generated lottery number
        int lotteryDigit1 = lottery / 10; // get the first digit
        int lotteryDigit2 = lottery % 10; // get the last digit

        int userGuessDigit1 = userGuess / 10;
        int userGuessDigit2 = userGuess % 10;

        System.out.println("The lottery number is " + lottery);

        if(userGuess == lottery) {
            System.out.println("Exact match: you win $10,000");
        } else if(userGuessDigit1 == lotteryDigit2 && userGuessDigit2 == lotteryDigit1) {
            System.out.println("Match all digits: you win $3,000");
        } else if(userGuessDigit1 == lotteryDigit1 || userGuessDigit1 == lotteryDigit2 || userGuessDigit2 == lotteryDigit1 || userGuessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("No match");
        }

        scanner.close();
    }
}
