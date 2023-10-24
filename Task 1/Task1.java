import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int score = 0;
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            int correctNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Guess a number between " + minRange + " and " + maxRange + ".");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (Attempt " + (attempts + 1) + "/" + maxAttempts + "): ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == correctNumber) {
                    System.out.println("Congratulations! You guessed the correct number: " + correctNumber);
                    hasGuessedCorrectly = true;
                    break;
                } else if (userGuess < correctNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + correctNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = sc.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            } else {
                score++;
            }
        }

        System.out.println("Thanks for playing! Your total score is: " + score);
        System.out.println("---------------------------------------------------------------------");
        sc.close();
    }
}
