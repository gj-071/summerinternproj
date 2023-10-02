import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1;
        
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");
        
        while (attempts < 5) { 
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < numberToGuess) {
                System.out.println("Try higher.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Try lower.");
            } else {
                hasGuessedCorrectly = true;
                break;
            }
        }
        
        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry, you've run out of attempts. The correct number was " + numberToGuess + ".");
        }
        

    }
}
