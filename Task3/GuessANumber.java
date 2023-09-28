import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;
    private static Scanner scanner;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;

        scanner = new Scanner(System.in);

        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
        if (scanner.hasNextInt()) {
            int guess = scanner.nextInt();

            if (guess > rnd_number) {
                System.out.println("Guess is too high.");
                makeAGuess();
            } else if (guess < rnd_number) {
                System.out.println("Guess is too low.");
                makeAGuess();
            } else {
                System.out.println("You've guessed correctly!");
            }
        } else {
            System.out.println("Error: Please write numbers only.");
            makeAGuess();
        }
    }
}