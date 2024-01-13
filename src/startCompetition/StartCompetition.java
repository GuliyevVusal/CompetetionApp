package startCompetition;

import java.util.Scanner;

public class StartCompetition {

    public static void startCompetition(Scanner sc) {
        System.out.println("Cometiton started!");

        int selectedNumber = (int) (Math.random() * 5) + 1;

        System.out.println("System has chosen a number between 1 and 5. Guess the selected number: ");

        while (true) {
            System.out.println("Guess the selected number: ");
            int userGuess = sc.nextInt();
            sc.nextLine();

            if (userGuess == selectedNumber) {
                System.out.println("Congratulations, you won!");
                break;
            } else {
                System.out.println("You failed. Try again.");
            }
        }

    }
}
