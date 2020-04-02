
package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    private String nationality;
    private String birthdate;
    private String team;
    private int goals;
    private int assists;
    private int penalties;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setGoals(String goals) {
        try {
            this.goals = Integer.parseInt(goals.trim());
        } catch (NumberFormatException nfe) {
            this.goals = 0;
        }

    }

    public int getGoals() {
        return goals;
    }

    public void setAssists(String assists) {
        try {
            this.assists = Integer.parseInt(assists.trim());
        } catch (NumberFormatException nfe) {
            this.assists = 0;
        }
    }

    public int getAssists() {
        return assists;
    }

    public void setPenalties(String penalties) {
        try {
            this.penalties = Integer.parseInt(penalties.trim());
        } catch (NumberFormatException nfe) {
            this.penalties = 0;
        }
    }

    public int getPenalties() {
        return penalties;
    }

    public int getPoints() {
        return goals + assists;
    }

    public int compareTo(Player comparePlayer) {
        int comparePoints = ((Player) comparePlayer).getPoints();
        return comparePoints - this.getPoints();
    }

    @Override
    public String toString() {
        return String.format("%-20s %s %5d + %2d = %2d ", name, team, goals, assists, this.getPoints());
    }

}
