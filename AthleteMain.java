package Programming;

import java.util.*;

public class AthleteMain {
    public static void main(String[] args) {
             
        Scanner scan = new Scanner(System.in);
        ArrayList<ClassAthletes> athletes = new ArrayList<>();

        LogoAthlete logo = new LogoAthlete();
        logo.printLogo();

        ChoiceMainMenu mainMenu = new ChoiceMainMenu(scan, athletes);
        mainMenu.displayMainMenu();
        
    }
}

