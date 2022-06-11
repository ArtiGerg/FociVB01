package FociVB.EztNezzetekKerlek;



public class Matches {

        private int year;
        private String stage;
        private String date;
        private String teamA;
        private String teamB;
        private int goalA;
        private int goalB;
        private int penaltiesA;
        private int pentaltiesB;

        public Matches() {

        }
    public Matches(String line) {

        String[] parts = line.split(";");
        this.year = Integer.parseInt(parts[0]);
        this.stage = parts[1];
        this.date = parts[2];
        this.teamA = parts[3];
        this.teamB = parts[4];
        this.goalA = Integer.parseInt(parts[5]);
        this.goalB = Integer.parseInt(parts[6]);
        if (parts.length > 7) {
            this.penaltiesA = Integer.parseInt(parts[7]);
            this.pentaltiesB = Integer.parseInt(parts[8]);

        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public int getGoalA() {
        return goalA;
    }

    public void setGoalA(int goalA) {
        this.goalA = goalA;
    }

    public int getGoalB() {
        return goalB;
    }

    public void setGoalB(int goalB) {
        this.goalB = goalB;
    }

    public int getPenaltiesA() {
        return penaltiesA;
    }

    public void setPenaltiesA(int penaltiesA) {
        this.penaltiesA = penaltiesA;
    }

    public int getPentaltiesB() {
        return pentaltiesB;
    }

    public void setPentaltiesB(int pentaltiesB) {
        this.pentaltiesB = pentaltiesB;
    }
}
