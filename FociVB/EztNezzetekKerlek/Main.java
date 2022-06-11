package FociVB.EztNezzetekKerlek;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Matches> matchesList = new ArrayList<>();
        try {
            try (BufferedReader reader = new BufferedReader(new FileReader("src/FociVB/EztNezzetekKerlek/matches_all.csv"))) {
                String line;
                reader.readLine();
                while ((line = reader.readLine()) != null) {
                    Matches matches = new Matches(line);
                    matchesList.add(matches);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();


        }
        System.out.println("Number of matches : " + matchesList.size());
        System.out.println("Year of worldcup:");
        int host = scanner.nextInt();

        List<Matches> matches2010 = new ArrayList<>();
        List<Matches> matches2014 = new ArrayList<>();
        List<Matches> matches2018 = new ArrayList<>();

        for (Matches matches : matchesList) {
            if (matches.getYear() == 2010) {
                matches2010.add(matches);
            } else if (matches.getYear() == 2014) {
                matches2014.add(matches);
            } else if (matches.getYear() == 2018) {
                matches2018.add(matches);

            }
        }
            if (host==2014){


            int different = 0;
            for (Matches matches : matches2014) {
                int sum = Math.abs(matches.getGoalA() - matches.getGoalB());
                if (sum > different) {
                    different = sum;
                }
            }
            System.out.println("Maximum goal difference: " + different);
                int counter =0;
            for (Matches matches: matches2014) {
                if (matches.getGoalB()==matches.getGoalA()&&matches.getPenaltiesA()> matches.getPentaltiesB()){
                    counter++;
                }
                if (matches.getGoalA()<matches.getGoalB() ){
                    counter++;
                }
            }
                System.out.println("The player has won : " + counter + " bets" );
        }
        try (PrintWriter writer = new PrintWriter("selected.txt")) {

            writer.println("stage;date;team_a;team_b;goals_a;goals_b;penalties_a;penalties:b");

            for (Matches matches1: matches2014){
                String line = matches1.getStage()
                        +";"+matches1.getDate()
                        +";"+matches1.getTeamA()
                        +";"+matches1.getTeamB()
                        +";"+matches1.getGoalA()
                        +";"+matches1.getGoalB()
                        +";"+matches1.getPenaltiesA()
                        +";"+matches1.getPentaltiesB();
                if (matches1.getPenaltiesA()==0){

                }
                writer.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        }
}
