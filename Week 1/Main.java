// Number Guessing Game
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String continueGame = "yes";
        while (continueGame.equals("yes")) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(100);
            int guess = -1;
            int tries = 0;
            
            System.out.println("Guess a number between 1 and 100:");
            while (true) {
                guess = reader.nextInt();
                tries++;
                
                if (guess==randomNumber) {
                    System.out.println("Awsome! You guessed the number in " + tries + " tries!");
                    break;
                } else {
                    System.out.println("The number is "  + ((guess<randomNumber) ? "greater" : "less") + " than " + guess);
                }
            }
            System.out.println("Do you want to continue? (yes/no):");
            continueGame = reader.next().toLowerCase();
        }
        reader.close();
    }
}