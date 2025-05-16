import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 5;
        int score = 0;
        boolean playAgain;

        System.out.println("=== Welcome to the Number Guessing Game! ===");

        do {
            int targetNumber = random.nextInt(100) + 1; // Random number between 1 and 100
            int attemptsLeft = maxAttempts;
            boolean guessedCorrectly = false;

            System.out.println("\nI'm thinking of a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while
