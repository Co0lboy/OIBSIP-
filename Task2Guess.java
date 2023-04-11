
import java.util.Scanner;
import java.util.Random;

public class Task2Guess  {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int userGuess;
        int numAttempts = 0;
        int maxAttempts = 10; // Change this number to set the maximum number of attempts
        
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        
        while (numAttempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            numAttempts++;
            
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + numAttempts + " attempts!");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Your guess is too low. Try again!");
            } else {
                System.out.println("Your guess is too high. Try again!");
            }
        }
        
        if (numAttempts == maxAttempts) {
            System.out.println("Sorry, you've used up all " + maxAttempts + " attempts. The number was " + randomNumber + ".");
        }
    }
}
