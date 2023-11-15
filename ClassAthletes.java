package Programming;

class ClassAthletes {

    private String athleteName;

    private String trainingPlan;

    private double kg;

    private String category;

    private int compe;

    private int tuition;

    public ClassAthletes(String athleteName, String trainingPlan, double kg, String category, int compe, int tuition) {
        
        this.athleteName = athleteName;

        this.trainingPlan = trainingPlan;

        this.kg = kg;

        this.category = category;

        this.compe = compe;

        this.tuition = tuition;
    }

    public double Gettuitioncost() {
            return 9.00d * 4.00 * tuition;
        }
    
    public double GettrainingPlancost() {
            return switch (trainingPlan.toLowerCase()) {
                case "beginner" -> 25.00 * 4;
                case "intermediate" -> 30.00 * 4;
                case "elite" -> 35.00 * 4;
                default -> 0;
            };
        }
    
    public double GetCostCompetition() {
            if (trainingPlan.equalsIgnoreCase("Intermediate") || trainingPlan.equalsIgnoreCase("Elite")) {
                return 22.00 * compe;
            } else {
                return 0.00;
            }
        }
    
    public double GettotalCost() {
            double trainingFee = GettrainingPlancost();
            double competitionFee = GetCostCompetition();
            double tuitionFee = Gettuitioncost();
            return trainingFee + competitionFee + tuitionFee;
        }    

    @Override
    public String toString() {

    return "\n════════════════════════════════════════════════════════════════════════════════" +
           "\n║\t\t\t\s\sAthlete's Information:                               ║" +
           "\n════════════════════════════════════════════════════════════════════════════════" +
           "\n\sName                     :\s" + athleteName + 
           "\n\sTraining Plan            :\s" + trainingPlan +
           "\n\sCurrent Weight           :\s" + kg +
           "\n\sWeight Category          :\s" + category +
           "\n\sCompetition per Month    :\s" + compe +
           "\n\sPrivate Coaching         :\s" + tuition +
           "\n════════════════════════════════════════════════════════════════════════════════" +
           "\n════════════════════════════════════════════════════════════════════════════════" +
           "\n║\t\t\tAthlete's Cost of the Month:                           ║" +
           "\n════════════════════════════════════════════════════════════════════════════════" +
           "\nCalculated Training Plan  : \s$" + String.format("%.2f", GettrainingPlancost()) +
           "\nCalculated Competition Fee: \s$" + String.format("%.2f", GetCostCompetition()) +
           "\nCalculated Private Hours  : \s$" + String.format("%.2f", Gettuitioncost()) +
           "\n--------------------------------------------------------------------------------" +
           "\nTotal Cost                : \s$" + String.format("%.2f", GettotalCost()) +
           "\n════════════════════════════════════════════════════════════════════════════════";
    }
}

    