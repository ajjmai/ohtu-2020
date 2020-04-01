
package ohtu;

public class Player {
    private String name;
    private String nationality;
    private String birthdate;
    private String team;
    private int goals;
    private int assists;
    private int penalties;

    // {"goals":0,"assists":1,"name":"Jack
    // Studnicka","penalties":2,"team":"BOS","nationality":"CAN","birthdate":"1999-02-18"}
    // Henrik Borgstrom team FLA goals 0 assists 0

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

    @Override
    public String toString() {
        return name + ", team: " + team + ", points: " + (goals + assists);
    }

}
