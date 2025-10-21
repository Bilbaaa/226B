import java.util.Comparator;
import java.util.Objects;

public class Team implements Comparable<Team> {
    private String squadName;
    private String school;
    private String sport;
    private double points;


    public Team(String squadName, String school, String sport, double points) {
        this.squadName = squadName;
        this.school = school;
        this.sport = sport;
        this.points = points;
    }

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;
        return squadName.equals(team.squadName) && school.equals(team.school); //CONTROLLA SIA NOME SQUADRA CHE SCUOLA, SE UNO DEI 2 UGUALI AD ALTRO RITORNA FALSO QUANDO SI ISTANZIA L'OGGETTO
    }

    @Override
    public int hashCode() {
        int result = squadName.hashCode();
        result = 31 * result + school.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "\b\bTeam " +
                 squadName + " aggiunto al torneo di " + sport + "\n";

    }

    @Override
    public int compareTo(Team o) {
        return Double.compare(o.points, this.points);
    }
}
