package Programming;

import java.util.*;

public class ChoiceMainMenu {
    private Scanner scan;
    private ArrayList<ClassAthletes> athletes;

    public ChoiceMainMenu(Scanner scan, ArrayList<ClassAthletes> athletes) {
        this.scan = scan;
        this.athletes = athletes;
    }

    public void displayMainMenu() {
        int choiceOption;

        while (true) {
            System.out.println("\t\t\t\t\t\t\tWELCOME TO NORTH SUSSEX JUDO TRAINING CENTER");
            System.out.println("\t\t\t\t\t* ═══════════════════════════════════════════════════════════════════════════ *");
            System.out.println("\t\t\t\t\t  |                              MAIN MENU                                  |");
            System.out.println("\t\t\t\t\t  |                                                                         |");
            System.out.println("\t\t\t\t\t* =========================================================================== *");
            System.out.println("\t\t\t\t\t  |                           1.  Add an Athlete                            |");
            System.out.println("\t\t\t\t\t  ---------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t  |                           2. View Athlete data                          |");
            System.out.println("\t\t\t\t\t  ---------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t  |                           3.     Exit                                   |");
            System.out.println("\t\t\t\t\t* ═══════════════════════════════════════════════════════════════════════════ *");

            while (true) {
                try {
                    System.out.print("Enter your choice: ");
                    choiceOption = Integer.parseInt(scan.nextLine());
                    System.out.println("");
                    if (choiceOption >= 1 && choiceOption <= 3) {
                        break;
                    } else {
                        System.out.println("Please only enter 1 to 3. Thank you!");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number. Thank you!");
                }
            }

            if (choiceOption == 1) {
                RegisteredInput registeredInput = new RegisteredInput(scan);
                String name, plan, category;
                int compe, tuition;
                double kg;

                name = registeredInput.getAthleteName();
                plan = registeredInput.getTrainingPlan();
                kg = registeredInput.getKg();
                category = registeredInput.getCategory();
                compe = registeredInput.getCompe();
                tuition = registeredInput.getTuition();

                ClassAthletes athlete = new ClassAthletes(name, plan, kg, category, compe, tuition);
                athletes.add(athlete);
                System.out.println("\n+----------------------------------+");
                System.out.println("|    Athlete added to the data!    |");
                System.out.println("+----------------------------------+\n");

            } else if (choiceOption == 2) {
                if (athletes.isEmpty()) {
                    System.out.println("No Athletes Registered Yet. Thank you!");
                } else {
                    for (ClassAthletes athlete : athletes) {
                        System.out.println(athlete);
                        System.out.println("");
                    }
                }
            } else {
                System.out.println("\n\nWe appreciate your registering in North Sussex Judo. Have a Good Day!\n\n");
                break;
            }
        }
    }
}