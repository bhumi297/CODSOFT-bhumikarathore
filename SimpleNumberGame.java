import java.util.Scanner;
import java.util.Random;

public class SimpleNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String playAgain;

        do {
            int number = rand.nextInt(100) + 1; // Random number between 1 and 100
            int guess;
            int attempts = 5;
            boolean correct = false;

            System.out.println("Guess the number between 1 and 100. You have 5 attempts.");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();

                if (guess == number) {
                    System.out.println("Correct! You guessed the number.");
                    correct = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }

                attempts--;
                System.out.println("Attempts left: " + attempts);
            }

            if (!correct) {
                System.out.println("You are out of attempts. The correct number was: " + number);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = input.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Game Over. Thank you for playing!");
        input.close();
    }
}