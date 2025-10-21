import javax.crypto.spec.PSource;
import java.util.*;

public class TournamentManager {
    private Set<Team> teams = new HashSet<>();

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void updateScore(String squadName, double score){
        for (Team team : teams) {
            if (team.getSquadName().equals(squadName)) {
                team.setPoints(score);
                return;
            }
        }
    }
    public void printTeamsSortedByNatural(){
        List<Team> teamList = new ArrayList<>(teams);
        System.out.println("Sorting by natural order (squad name):");
        Collections.sort(teamList);
        System.out.println(teamList);

    }
    public void printTeamsSortedBySchool(){
        List<Team> teamList = new ArrayList<>(teams);
        System.out.println("Sorting by school:");
        Collections.sort(teamList, new SchoolComparator());
        System.out.println(teamList);
    }
    public void printTeamsSortedBySport(){
        List<Team> teamList = new ArrayList<>(teams);
        System.out.println("Sorting by sport:");
        Collections.sort(teamList, new SportComparator());
        System.out.println(teamList);
    }
    public void printScores(){
        for (Team team : teams) {
            System.out.println(team.getSquadName() + ": " + team.getPoints());
        }
    }

}
