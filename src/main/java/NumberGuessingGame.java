import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (guess != secretNumber) {

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You guessed the number!");
            }
        }

        scanner.close();
    }
}