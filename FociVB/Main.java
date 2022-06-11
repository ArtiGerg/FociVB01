package FociVB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
/*
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Map<Integer,WorldCups> worldCupsList = new TreeMap<>();
        List<Matches> matchesList = new ArrayList<>();




        try {
            worldCupsList =loadWorldCups("C:\\Users\\Arcsi\\FociVB\\src\\FociVB\\worldcups.csv");
            matchesList = loadMatches("src/FociVB/matches_all.csv", worldCupsList.get(192));



            System.out.println("Number of matches : " +matchesList.size());
            System.out.println("Name of host:" );
            String host= scanner.nextLine();
            if (host.equals("Brazil")){
              List<Matches> matchesBrazil= new ArrayList<>();
                for (Matches matches: matchesList){
                    if (matches.getWorldCups().getHost().equals("Brazil")){
                        matchesBrazil.add(matches);
                    }
                }
                writeMatches("selected.txt",matchesBrazil);
                int different =0;
                for (Matches matches: matchesBrazil) {
                    int sum = Math.abs(matches.getGoalA()-matches.getGoalB());
                    if (sum>different){
                        different=sum;
                    }
                }
                System.out.println("Maximum goal difference: " +different);



            }

        }catch (IOException e) {
            e.printStackTrace();
        }

    }


 private static Map<Integer,WorldCups> loadWorldCups(String path) throws IOException{
        Map<Integer,WorldCups> worldCupsList =new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;

            reader.readLine();

            while((line =reader.readLine()) != null) {
                WorldCups worldCups = new WorldCups(line);
                worldCupsList.put(worldCups.getYear(),worldCups);
            }


        }
        return worldCupsList;
 }
/*
    private static List<Matches> loadMatches(String path, WorldCups worldCups) throws IOException{
        List<Matches> matchesList =new ArrayList<>();
        try {
            try (BufferedReader reader =new BufferedReader(new FileReader(path))){
                String line;
                reader.readLine();
                while ((line =reader.readLine()) != null){
                    Matches matches = new Matches(worldCups,line);
                    worldCups.getMatches().add(matches);
                    matchesList.add(matches);

                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }return matchesList;
    }


 private static void writeMatches(String path, Collection<Matches> matches) throws IOException {
        try (PrintWriter writer= new PrintWriter(path)){
            writer.println("stage;date;team_a;team_b;goals_a;goals_b;penalties_a;penalties:b");

            for (Matches matches1: matches){
                String line = matches1.getStage()
                        +";"+matches1.getDate()
                        +";"+matches1.getTeamA()
                        +";"+matches1.getTeamB()
                        +";"+matches1.getGoalA()
                        +";"+matches1.getGoalB()
                        +";"+matches1.getPenaltiesA()
                        +";"+matches1.getPentaltiesB();
                writer.println(line);
            }

        }
 }

}

 */


