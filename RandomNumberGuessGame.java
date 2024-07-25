package com.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessGame {

    private static final int MAX_ATTEMPTS = 10;
    private static final int LOWER_BOUND = 1;
    private static final int UPPER_BOUND = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Enter your username: ");
        String name = scanner.nextLine();
        
        System.out.println("Hello, " + name + "! Please read these instructions:");
        System.out.println("==========================================================");
        System.out.println("------------------------GAME RULES------------------------");
        System.out.println("1) I will choose a number from " + LOWER_BOUND + " to " + UPPER_BOUND);
        System.out.println("2) You need to guess that number.");
        System.out.println("3) You will have " + MAX_ATTEMPTS + " chances to guess the number.");
        System.out.println("4) If you guess the number within " + MAX_ATTEMPTS + " attempts, you win!");
        System.out.println("==========================================================");

        boolean playGame = true;
        
        while (playGame) {
            int myNumber = generateRandomNumber(random);
            boolean guessedCorrectly = false;

            for (int attempts = 1; attempts <= MAX_ATTEMPTS; attempts++) {
                System.out.print("Enter your guess (" + attempts + "/" + MAX_ATTEMPTS + "): ");
                int yourGuess = scanner.nextInt();

                if (yourGuess == myNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                } else if (yourGuess < myNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all " + MAX_ATTEMPTS + " attempts. The number was " + myNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            scanner.nextLine();  // Consume the leftover newline
            playGame = scanner.nextLine().equalsIgnoreCase("yes");
        }
        
        System.out.println("Ok, thanks for playing!");
        scanner.close();
    }

    private static int generateRandomNumber(Random random) {
        return random.nextInt(UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND;
    }
}
