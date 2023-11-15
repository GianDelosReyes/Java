package Programming;

import java.util.*;

public class RegisteredInput {

    public String getAthleteName() { return athleteName; }
    public void setAthleteName(String athleteName) { this.athleteName = athleteName; }

    public String getTrainingPlan() { return trainingPlan; }
    public void setTrainingPlan(String trainingPlan) { this.trainingPlan = trainingPlan; }

    public double getKg() { return kg; }
    public void setKg(double kg) { this.kg = kg; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public int getCompe() { return compe; }
    public void setCompe(int compe) { this.compe = compe; }

    public int getTuition() { return tuition; }
    public void setTuition(int tuition) { this.tuition = tuition; }

        String athleteName, trainingPlan, category;
    
        int compe, tuition, choices;
    
        double kg;
        
        boolean validTrainingPlan;

        public RegisteredInput(Scanner scan) 
        {

        System.out.println("");//spaces

            System.out.println("North Sussex Judo Registering Process");
            System.out.println("═════════════════════════════════════");
        while (true) 
        {
            System.out.print("Enter Athlete's Name: ");
            athleteName = scan.nextLine();

            if (athleteName.matches("[A-Za-z ]+") && athleteName.length() > 1) 
            {
                break;
            } else 
             {
                System.out.println("Invalid input. Please enter a valid name.");
             }
        }
        
        System.out.println("");//spaces

        System.out.println("\t\t\t╔════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                     Training Plan Prices                       ║");
        System.out.println("\t\t\t╠═════════════════════╦══════════════════════════════════════════════════════════╣");
        System.out.println("\t\t\t║      Plan Type      ║                  Weekly Fee ($)                          ║");
        System.out.println("\t\t\t╠═════════════════════╬══════════════════════════════════════════════════════════╣");
        System.out.println("\t\t\t║       Beginner      ║                     $ 25.00                              ║");
        System.out.println("\t\t\t║     Intermediate    ║                     $ 30.00                              ║");
        System.out.println("\t\t\t║        Elite        ║                     $ 35.00                              ║");
        System.out.println("\t\t\t╠═════════════════════╩══════════════════════════════════════════════════════════╣");
        System.out.println("\t\t\t\t\t(1 for Beginner, 2 for Intermediate, 3 for Elite)");
        do {
            System.out.print("Enter Training plan: ");
            String input = scan.nextLine();
            try {
                choices = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid input.");
                    continue;
             }
            switch (choices) {
            case 1:
                trainingPlan = "beginner";
                validTrainingPlan = true;
                break;
            case 2:
                trainingPlan = "intermediate";
                validTrainingPlan = true;
                break;
            case 3:
                trainingPlan = "elite";
                validTrainingPlan = true;
                break;
            default:
            System.out.println("Invalid input. Please enter a valid number.");
            break;
            }
        } while (!validTrainingPlan);

        System.out.println("");//spaces

        while (true) {
            System.out.print("Enter Current Weight (in kg): ");
            String kgInput = scan.nextLine();

            try {
                kg = Double.parseDouble(kgInput);
                kg = Math.round(kg);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number. Thank you!");
            }
        }

        System.out.println();//spaces

            System.out.println("\t\t\t╔════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("\t\t\t║          Weight Category             ║           Upper Weight Limit (kg)       ║");
            System.out.println("\t\t\t║======================================║=========================================║");
            System.out.println("\t\t\t║            Heavyweight               ║            Unlimited (over 100)         ║");
            System.out.println("\t\t\t║         Light-Heavyweight            ║                   100                   ║");
            System.out.println("\t\t\t║            Middleweight              ║                   90                    ║");
            System.out.println("\t\t\t║         Light-Middleweight           ║                   81                    ║");
            System.out.println("\t\t\t║            Lightweight               ║                   73                    ║");
            System.out.println("\t\t\t║             Flyweight                ║                   66                    ║");
            System.out.println("\t\t\t══════════════════════════════════════════════════════════════════════════════════");
        while (true) {
            System.out.print("Enter Weight Category: ");
            category = scan.nextLine();

            if (category.matches("[A-Za-z -]+") && category.length() > 1) {
                if (category.equalsIgnoreCase("Heavyweight") && kg > 100 ||
                category.equalsIgnoreCase("Light-Heavyweight") && kg > 90 && kg <= 100 ||
                category.equalsIgnoreCase("Middleweight") && kg > 81 && kg <= 90 ||
                category.equalsIgnoreCase("Light-Middleweight") && kg > 73 && kg <= 81 ||
                category.equalsIgnoreCase("Lightweight") && kg > 66 && kg <= 73 ||
                category.equalsIgnoreCase("Flyweight") && kg <= 66 && kg >= 0) {
                    break;
                } else {
                    System.out.println("Invalid weight category for the given weight. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid weight category.");
            }
        }

        System.out.println("");//spaces
        
        if (!trainingPlan.equalsIgnoreCase("Beginner")) 
        {
         System.out.println("Competition entry fee - $22.00 per competition");
            while (true) 
            {
                System.out.print("Enter Competition Per Month: ");
                String compeInput = scan.nextLine();
                try {
                    compe = Integer.parseInt(compeInput);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number, Thank you!");
                }
            }
        }

        System.out.println("");//spaces
        
        if (!trainingPlan.equalsIgnoreCase("Beginner")) 
        {
            do {
                System.out.print("Do you want to avail Private Coaching Hours? (yes/no): ");
                String choice = scan.nextLine();
                if (choice.equalsIgnoreCase("yes")) 
                {
                    do {
                        System.out.println("Private Coaching Hours - $9.00 per hour ");
                        System.out.print("Enter number of Private Coaching Hours: ");
                        String tuitionInput = scan.nextLine();
                    try {
                            tuition = Integer.parseInt(tuitionInput);
                                if (tuition <= 5 && tuition >= 1) 
                            {
                                break;
                            } else 
                            {
                                System.out.println("Maximum is 5 Hours Only!");
                            }
                    } catch (NumberFormatException e) 
                     {
                       System.out.println("Invalid input. Please enter a valid number, Thank you!");
                     }
                    } while (true);
                break;
                } else if (choice.equalsIgnoreCase("no")) 
                {
                break;
            } else 
                {
                  System.out.println("Invalid input. Please enter 'yes' or 'no', Thank you!");
                }
         
            } while(true);
        }     
    }
}



