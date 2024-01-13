package menu;

import contestant.Contestant;
import registerContestants.RegisterContestants;
import startCompetition.StartCompetition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<Contestant> contestantList = new ArrayList<>();
    public RegisterContestants registerContestants = new RegisterContestants();
    private StartCompetition startCompetition = new StartCompetition();

    public void displayMenu(Scanner sc) {
        showMenuOptions(sc);
    }
    private void showMenuOptions(Scanner sc){

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Register contestants ");
            System.out.println("2. Start the competition ");
            System.out.println("3. Logout ");
            System.out.println("4. Exit ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    registerContestants.registerContestants(sc, contestantList);
                    break;
                case 2:
                    startCompetition(sc);
                    break;

                case 3:
                    System.out.println("Logged out successfully. ");
                    return;

                case 4:
                    System.out.println("Exiting the application. Goodbye! ");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;

            }
        }
    }

    private void startCompetition(Scanner sc) {
        startCompetition.startCompetition(sc);
    }
}
